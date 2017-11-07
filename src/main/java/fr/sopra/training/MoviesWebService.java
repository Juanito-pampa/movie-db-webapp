package fr.sopra.training;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;


@Path("movies")
public class MoviesWebService {
	
	private static Tools tools = new Tools();
	

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Movie> getMoviesList(@Context HttpServletRequest req){
		List<Movie> movies = tools.getMoviesList(req);
		return movies;
	}
	
	
	@POST
	@Consumes( MediaType.APPLICATION_JSON )
	@Produces( MediaType.APPLICATION_JSON )
	public Movie addMovieList(@Context HttpServletRequest req, Movie movie){
		List<Movie> movies = tools.getMoviesList(req);
		movies.add(movie);
		return movie;
	}
	
	
	
	
}
