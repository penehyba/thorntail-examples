package org.wildfly.swarm.examples.jpa.war;

import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

/**
 * @author Bob McWhirter
 */
@RunWith(Arquillian.class)
public class JPAApplicationIT {
//public class JPAApplicationIT extends AbstractIntegrationTest {

    @Drone
    WebDriver browser;

    @Test
    @Ignore
    public void testIt() {
        browser.navigate().to("http://localhost:8080/employee");
        String pageSource = browser.getPageSource();
//        assertThat(pageSource).contains("Penny");
//        assertThat(pageSource).contains("Sheldon");
//        assertThat(pageSource).contains("Amy");
//        assertThat(pageSource).contains("Priya");
        System.out.println("PAGE SOURCE: " + pageSource);
    }

    @Test
    @Ignore
    public void testExampleDS() {
        browser.navigate().to("http://localhost:8080/api/connection/example");
        String pageSource = browser.getPageSource();
        System.out.println("PAGE SOURCE: " + pageSource);
    }

    @Test
    public void testMyDS() {
//        browser.navigate().to("http://localhost:8080/api/connection/ping");
        browser.navigate().to("http://localhost:8080/api/connection/my");
        String pageSource = browser.getPageSource();
        System.out.println("PAGE SOURCE: " + pageSource);
    }
}
