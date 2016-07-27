package edu.ub.san;

/**
 * Created by dhandapa on 7/26/16.
 */
public class Facility {
	private int id;
	private String name;

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Facility{");
		sb.append("id=").append(id);
		sb.append(", name='").append(name).append('\'');
		sb.append('}');
		return sb.toString();
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
