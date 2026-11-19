package ec.edu.puce;

import ec.edu.puce.sport.model.Jugador;
import ec.edu.puce.sport.model.JugadorBasico;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Path("/sport")
public class SportController {

    List<JugadorBasico> jugadores=new ArrayList<>();


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response crearJugadorBasico(JugadorBasico jugador) {
        // Ocupas directamente tu clase Jugador con su constructor de 3 parámetros
        IO.println("El jugador es: %s".formatted(jugador.nombre()));
        jugadores.add(jugador);
        return Response.status(Response.Status.CREATED).entity(jugador).build();
    }
}