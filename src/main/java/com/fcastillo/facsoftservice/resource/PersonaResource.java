package com.fcastillo.facsoftservice.resource;

import com.fcastillo.facsoftservice.ejb.PersonasFacadeLocal;
import com.fcastillo.facsoftservice.entity.Personas;
import java.util.List;
import javax.ejb.EJB;
import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author fcastillo
 */
@Path("Personas")
public class PersonaResource {

    @EJB
    PersonasFacadeLocal personasEJB;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response findAll() {
        List<Personas> lstPersonas = personasEJB.findAll();
        JsonObjectBuilder job = Json.createObjectBuilder();
        JsonArrayBuilder jab = Json.createArrayBuilder();
        lstPersonas.stream().forEach(x -> {
            job.add("Apellido", x.getApellido());
            job.add("Nombre", x.getNombre());
            job.add("dni", x.getDocumento());
            job.add("tipodocumento", x.getTipodocumento());
            job.add("fnacimiento", x.getFechadenacimiento().toString());
            job.add("sexo", x.getSexo());
            job.add("correo", x.getCorreo());
            job.add("telefono", x.getTelefono());
            jab.add(job);
        });
        return Response.status(Response.Status.OK).entity(jab.build()).build();
    }
}
