package eetac.dsa.lab;

import eetac.dsa.lab.entity.Eetakemon;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Home on 15/04/2017.
 */
@Path("")
public class EetakemonService {


    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addEetakemon(Eetakemon e) {
        System.out.println(e.toString());
        try {
            e.insert();
            System.out.println(e.toString());
            return Response.status(201).entity("Eetakemon added successfully: " + e).build();
        } catch (Exception e1) {
            e1.printStackTrace();
            return Response.status(409).entity("Eetakemon already exists!").build();
        }
          /*
           {
             id: 3,
             code: "errot!
           }
         */
    }


    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Eetakemon> listEetakemon() throws Exception {
        Eetakemon e = new Eetakemon();
        List<Eetakemon> list = e.findAll();
        return list;
    }


    @GET
    @Path("/name/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Eetakemon> searchByName (@PathParam("name") String name) throws Exception {
        Eetakemon e = new Eetakemon(null,name,null);
        List<Eetakemon> list = e.selectByName();
        return list;
    }

    @GET
    @Path("/{id}/delete")
    public Response delById(@PathParam("id") int id) {
        Eetakemon e = new Eetakemon(id,null,null);
        try {
            e.delete();
            return Response.status(200).entity("Eetakemon deleted successfully.").build();
        } catch (Exception e1) {
            e1.printStackTrace();
            return Response.status(202).entity("Eetakemon does not exists.").build();
        }
    }

    @POST
    @Path("/modify")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateEetakemon(Eetakemon e) {
        try {
            e.update();
            return Response.status(201).entity("Eetakemon added successfully: " + e).build();
        } catch (Exception e1) {
            e1.printStackTrace();
            return Response.status(409).entity("Eetakemon already exists!").build();
        }
    }
    /*
    {
       result: 202,
       msg: "aaaaa"
    }
*/
}
