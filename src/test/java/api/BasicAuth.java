package api;

import io.restassured.response.Response;
import org.junit.Test;
import org.junit.Assert;

public class BasicAuth {

    @Test
    public void BasicAuth(){

        Http http = new Http(
                EnvSetup.getURL());

        http.basicAuth(EnvSetup.getAdminUserName(),
                EnvSetup.getAdminUserPassword());

        Response response = http.getResponseFrom("/todos.xml");

        Assert.assertEquals(200, response.getStatusCode());
    }


}
