package hfe;


import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class MrSpringTest {

    @Test
    public void rest() throws IOException {
        System.out.println(IOUtils.toString(getStream(), Charset.defaultCharset()));
    }

    private static InputStream getStream() throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = httpClient.execute(new HttpGet("http://localhost:8080/hello"));
        HttpEntity entity = response.getEntity();
        return entity.getContent();
    }
}