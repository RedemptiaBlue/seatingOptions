package com.redemptiablue.plane.rest;

import java.util.List;

import org.springframework.stereotype.Component;

import com.redemptiablue.plane.entity.SeatingType;

@Component
public class SmallPlane implements Plane {
	private List<SeatingType> seatingOptions;
	
	public SmallPlane(List<SeatingType> smallPlaneSeatingTypes) {
		seatingOptions = smallPlaneSeatingTypes;
	}

	@Override
	public String toString() {
		return "SmallPlane [seatingOptions=" + seatingOptions + "]";
	}

	public List<SeatingType> getSeatingOptions() {
		return seatingOptions;
	}

}
