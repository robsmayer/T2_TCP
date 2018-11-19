import java.util.ArrayList;

public abstract class AbstractUser {

	private int id;

	private String name;

	private String email;

	private String password;

	public void delUser() {

	}

	public void addUser() {

	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return this.id;
	}

	public void setName(String Name) {
		this.name=name;
	}

	public String getName() {
		return this.name;
	}

	public void setEmail(String email) {
		this.email=email;
	}

	public String getEmail() {
		return this.email;
	}

	public void setPassword(String password) {
		this.password=password;
	}

	public String getPassword() {
		return 	this.password;
	}

	public void AbstractUser(String name, String email, String password) {
		this.name = name;
		this.email=email;
		this.password= password;
	}

	public void exit() {

	}

	public PAMarray searchHistory(PAMarray history) {
		return null;
	}

	public ArrayList<Painting> searchPaintings(PAMarray arrayPaintings) {
		return null;
	}

	public ArrayList<Museum> searchMuseums(PAMarray arrayMuseum) {
		return null;
	}

	public ArrayList<Artist> searchArtists(PAMarray arrayArtists) {
		return null;
	}

	public PAMarray searchFavorites(PAMarray favorites) {
		return null;
	}

}
