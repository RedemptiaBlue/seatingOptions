package com.redemptiablue.plane.dao;
import java.util.List;

import com.redemptiablue.plane.entity.SeatingType;

public interface SeatingDAO {
	
	public List<SeatingType> getSmallPlaneSeatingTypes();
	public List<SeatingType> getLargePlaneSeatingTypes();

}
