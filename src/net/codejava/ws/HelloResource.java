package net.codejava.ws;
 
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 
@Path("/")
public class HelloResource {
 
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String direBonjour() {
        return "Bonjour, tout le monde!";
    }
    
    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("/world")
    public String sayHTMLHello() {
    	return "<html><title> Hello Rest</title><body>"
    			+"<h1> Hello World REST! </h1></body></html>";
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/json")
    public Studante sayHelloJSON() {
    	return new Studante(123,"Joao", "Brazil");
    }
}