package projeto;
public class Artist {

	private int id;

	private String name;

	private boolean alive;

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return this.id;
	}

	public void setName(String name) {
		this.name=name;

	}

	public String getName() {
		return this.name;
	}

	public void setAlive(boolean alive) {
		this.alive=alive;
	}

	public boolean getAlive() {
		return this.alive;
	}

	public Artist(String name, boolean alive) {
		this.name=name;
		this.alive=alive;
		/**Pegar novo id de função newId na interface*/

	}

}
