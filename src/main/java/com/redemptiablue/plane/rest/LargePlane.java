package com.redemptiablue.plane.rest;

import java.util.List;

import org.springframework.stereotype.Component;

import com.redemptiablue.plane.entity.SeatingType;

@Component
public class LargePlane implements Plane {
	private List<SeatingType> seatingOptions;

	public List<SeatingType> getSeatingOptions() {
		return seatingOptions;
	}

	public LargePlane(List<SeatingType> seatingOptions) {
		this.seatingOptions = seatingOptions;
	}

	public void setSeatingOptions(List<SeatingType> seatingOptions) {
		this.seatingOptions = seatingOptions;
	}

	@Override
	public String toString() {
		return "LargePlane [seatingOptions=" + seatingOptions + "]";
	}
	
	
	

}
