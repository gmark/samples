package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/service")
public class Service {
	
	Item item;
	
	public Service(){
		item = new Item();
		item.setName("mark");
		item.setAge("32");
	}

	@GET
	@Path("/itemJSON")
	@Produces({MediaType.APPLICATION_JSON})
	public Item itemsJSON() {
		
		return item;
		
	}
	
	
	@GET
	@Path("/itemXML")
	@Produces({MediaType.APPLICATION_XML})
	public Item itemsXML() {
		
		return item;
		
	}
	
}
