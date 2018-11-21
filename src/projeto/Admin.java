package projeto;
public class Admin extends AbstractUser {
	
	public Admin(String name, String email, String password) {
		super(name,email,password);
	}
	private boolean addArtist(int id, String name, boolean alive) {
		return false;
	}

	private boolean delArtist(Artist Artist) {
		return false;
	}

	private boolean addPaint(int id, String material, String name, String colection, int creationDate, boolean privatePiece, int status) {
		return false;
	}

	private boolean delPaint(Artist Paint) {
		return false;
	}

	private boolean addMuseum(int id, String name, float latitude, float longitude) {
		return false;
	}

	private boolean delMuseum(Museum Museum) {
		return false;
	}

	private boolean changeMuseum(Museum Artist) {
		return false;
	}

	private boolean changeArtist(Artist Artist) {
		return false;
	}

	private boolean changePaint(Painting Artist) {
		return false;
	}



}
