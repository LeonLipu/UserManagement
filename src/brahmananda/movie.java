//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package brahmananda;

import javax.annotation.security.PermitAll;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("movieService")
public class movie {
    public movie() {
    }

    @GET
    @Path("movie")
    @Produces({"text/plain"})
    public String getSingleMovie(@Context HttpServletResponse response) {
        response.addHeader("Access-Control-Allow-Origin", "*");
        System.out.println("get request is made with no argument");
        return "{\"name\":\"get all movie and may bed later point of time \"}";
    }

    @GET
    @Path("movie/{id}")
    @Produces({"text/plain"})
    public String getallmovie(@Context HttpServletResponse response, @PathParam("id") String id) {
        response.addHeader("Access-Control-Allow-Origin", "*");
        System.out.println("get reqiest is made");
        return "{\"name\":\"get all movie\"}";
    }

    @POST
    @Path("movie/{movieid}")
    @Produces({"application/json"})
    public String getname(@PathParam("movieid") String movieid, @Context HttpServletResponse response) {
        response.addHeader("Access-Control-Allow-Origin", "*");
        response.addHeader("Access-Control-Allow-Methods", "GET, DELETE, PUT, OPTIONS");
        response.addHeader("Access-Control-Allow-Headers", "X-Requested-With, Content-Type, X-Codingpedia,Authorization");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type, x-xsrf-token");
        return "{\"name\":\"My Name is Brahmananda kar\"}";
    }



    @OPTIONS
    @PermitAll
    public Response options() {
        System.out.println("hhhhhhhhhhhh");
        return Response.status(Status.NO_CONTENT).build();
    }

    @OPTIONS
    @Path("{path:.*}")
    @PermitAll
    public Response optionsAll(@PathParam("path") String path) {
        System.out.println("hhhhhhhhhhh");
        return Response.status(Status.NO_CONTENT).build();
    }

    @PUT
    @Path("movie/{id}/{name}")
    @Produces({"application/json"})
    public String nothing(@PathParam("id") String id, @PathParam("name") String name) {
        return "{\"name\":\"put dddd all movie\"}";
    }

    @DELETE
    @Path("movie/{id}")
    @Produces({"application/json"})
    public String postman(@PathParam("id") String id) {
        return "hrudaya hmm tu something ";
    }
}
