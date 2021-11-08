package com.redemptiablue.plane.rest;

import java.util.List;
import com.redemptiablue.plane.entity.SeatingType;

public interface Plane {
	
	public List<SeatingType> getSeatingOptions();

}
