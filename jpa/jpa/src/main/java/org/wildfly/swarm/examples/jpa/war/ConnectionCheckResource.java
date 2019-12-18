package org.wildfly.swarm.examples.jpa.war;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.enterprise.context.ApplicationScoped;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@ApplicationScoped
@Path(value = "/connection")
public class ConnectionCheckResource {

    @Resource
    private DataSource myDS;

    @GET
    @Produces("text/plain")
    @Path(value = "/example")
    public String getExampleDS() throws NamingException, SQLException {
        Context ctx = new InitialContext();
        DataSource ds = (DataSource) ctx.lookup("jboss/datasources/ExampleDS"); // ExampleDS was been created automatically using the auto-detected h2 driver
        try (Connection conn = ds.getConnection()) {
            return "ExampleDS: Howdy using connection: " + conn;
        }
    }
    @GET
    @Path(value = "/ping")
    public Response ping() {
        return Response.ok().build();
    }

    @GET
    @Path(value = "/my")
    public String getMyDS() throws NamingException, SQLException {
        Context ctx = new InitialContext();
//        DataSource ds = (DataSource) ctx.lookup("java:jboss/datasources/MyDS");
//        try (Connection conn = ds.getConnection()) {
        try (Connection conn = myDS.getConnection()) {
            try (PreparedStatement stmt = conn.prepareStatement("select count(*) from person");
                 ResultSet results = stmt.executeQuery()) {

                if (results.next()) {
                    int count = results.getInt(1);
                    return "CONNECTION: Found '" + "' items in person table!";
                } else {
                    return "CONNECTION: Howdy using connection: " + conn;
                }
            }
        } catch (Exception e) {
            return "Exception occurred: " + e.getLocalizedMessage();
        }
    }
}
