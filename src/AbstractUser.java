import java.util.ArrayList;

public abstract class AbstractUser {

	private int id;

	private String Name;

	private String email;

	private String password;

	public void delUser() {

	}

	public void addUser() {

	}

	public void setId(int id) {

	}

	public int getId() {
		return 0;
	}

	public void setName(String Name) {

	}

	public String getName() {
		return null;
	}

	public void setEmail(String email) {

	}

	public String getEmail() {
		return null;
	}

	public void setPassword(String password) {

	}

	public String getPassword() {
		return null;
	}

	public void AbstractUser(String name, String email, String password) {

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

	public PAMarray searchFavourites(PAMarray favourites) {
		return null;
	}

}
