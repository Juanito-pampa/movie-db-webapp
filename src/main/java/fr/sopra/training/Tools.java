package fr.sopra.training;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;

public class Tools {
	
	public List<Movie> getMoviesList(@Context HttpServletRequest req){
		List<Movie> list = (List<Movie>)req.getSession().getAttribute("movies");
		if (list ==null){
			list=new ArrayList<>();
			req.getSession().setAttribute("movies", list);
		}
		return list;
	}
}
