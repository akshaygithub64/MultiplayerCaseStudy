package multiPlayerCaseStudy;

public class Song {

	private int id;
	private String name;
	private double duration;
	private String movie;
	private String singer;

	@Override
	public String toString() {
		return " [id= " + id + ", name= " + name + ", duration= " + duration + ", movie= " + movie + ", singer= "
				+ singer + "]";
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

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public String getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

}
