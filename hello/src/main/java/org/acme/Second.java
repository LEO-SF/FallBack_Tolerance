package second;

import jakarta.annotation.security.RolesAllowed;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/second")
public class Second {

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public int getSoma(
        @FormParam("a") int a, @FormParam("b") int b){
        return a+b;
        }
}
