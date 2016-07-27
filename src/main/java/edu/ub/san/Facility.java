package edu.ub.san;

/**
 * Created by dhandapa on 7/26/16.
 */
public class Facility {
	private int id;
	private String name;
	private double lat, lon;

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Facility{");
		sb.append("id=").append(id);
		sb.append(", name='").append(name).append('\'');
		sb.append(", lat=").append(lat);
		sb.append(", lon=").append(lon);
		sb.append('}');
		return sb.toString();
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLon() {
		return lon;
	}

	public void setLon(double lon) {
		this.lon = lon;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
