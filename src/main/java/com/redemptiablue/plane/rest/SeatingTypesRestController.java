package com.redemptiablue.plane.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.redemptiablue.plane.dao.SeatingDAO;
import com.redemptiablue.plane.entity.SeatingType;

@RestController
@RequestMapping("/api")
public class SeatingTypesRestController {
	
	private SeatingDAO seatingDAO;

	@Autowired
	public SeatingTypesRestController(SeatingDAO seatingDAO) {
		this.seatingDAO = seatingDAO;
	}
	
	@GetMapping("/small_plane_seating")
	public Plane getSmallPlaneSeatingTypes() {
		return new SmallPlane(seatingDAO.getSmallPlaneSeatingTypes());
	}
	
	@GetMapping("/large_plane_seating")
	public Plane getLargePlaneSeatingTypes() {
		return new LargePlane(seatingDAO.getLargePlaneSeatingTypes());
	}

}
