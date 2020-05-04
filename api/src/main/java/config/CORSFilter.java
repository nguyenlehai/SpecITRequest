package config;
import java.io.IOException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.ext.Provider;

@Provider
@PreMatching
public class CORSFilter implements ContainerResponseFilter {
    @Override
    public void filter(ContainerRequestContext requestCtx, ContainerResponseContext responseCtx) throws IOException {
        String origin = requestCtx.getHeaderString("Origin");
        responseCtx.getHeaders().add("Access-Control-Allow-Origin", origin);
        responseCtx.getHeaders().add("Access-Control-Allow-Credentials", "true");
        responseCtx.getHeaders().add("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT");
        responseCtx.getHeaders().add("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
    }
}