package projeto;
public class Painting {

	private int id;

	private String material;

	private String name;

	private String colection;

	private int creationDate;

	private boolean privatePiece;

	private int status;

	private Artist artist;

	private Museum museum;

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return this.id;
	}

	public void setArtist(Artist artist) {
			this.artist=artist;
	}

	public Artist getArtist() {
		return this.artist;
	}

	public void setMaterial(String material) {
		this.material=material;
	}

	public String getMaterial() {
		return this.material;
	}

	public void setName(String name) {
		this.name=name;
	}

	public String getName() {
		return this.name;
	}

	public void setMuseum(Museum museum) {
			this.museum=museum;
	}

	public Museum getMuseum() {
		return this.museum;
	}

	public void setColection(String colection) {
		this.colection=colection;
	}

	public String getColection() {
		return this.colection;
	}

	public void setCreationDate(int creationDate) {
		this.creationDate=creationDate;
	}

	public int getCreationDate() {
		return this.creationDate;
	}

	public void setPrivatePiece(boolean privatePiece) {
		this.privatePiece=privatePiece;
	}

	public boolean isPrivatePiece() {
		return privatePiece;
	}

	public void setStatus(int status) {
		this.status=status;
	}

	public int getStatus() {
		return this.status;
	}

	public void Painting(String name, String colection, int creationDate, boolean privatePiece, int status) {
		this.name=name;
		this.colection=colection;
		this.creationDate=creationDate;
		this.privatePiece=privatePiece;
		this.status=status;
		
	}

}
