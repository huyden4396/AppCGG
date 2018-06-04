package org.khtn.group12.cgg.admintool.model;

public class Movie {
	public String name;
	public String image;
	public float rating;
	public String info;
	public String link_trailer;
	public String premiere;
	public String kind;
	public String directors;
	public String cast;
	public String time;
	public String language;

	public Movie(String name, String image, float rating, String info, String link_trailer, String premiere,
			String kind, String directors, String cast, String time, String language) {
		this.name = name;
		this.image = image;
		this.rating = rating;
		this.info = info;
		this.link_trailer = link_trailer;
		this.premiere = premiere;
		this.kind = kind;
		this.directors = directors;
		this.cast = cast;
		this.time = time;
		this.language = language;
	}

	public String getName() {
		return name;
	}

	public String getImage() {
		return image;
	}

	public float getRating() {
		return rating;
	}

	public String getInfo() {
		return info;
	}

	public String getLink_trailer() {
		return link_trailer;
	}

	public String getPremiere() {
		return premiere;
	}

	public String getKind() {
		return kind;
	}

	public String getDirectors() {
		return directors;
	}

	public String getCast() {
		return cast;
	}

	public String getTime() {
		return time;
	}

	public String getLanguage() {
		return language;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public void setLink_trailer(String link_trailer) {
		this.link_trailer = link_trailer;
	}

	public void setPremiere(String premiere) {
		this.premiere = premiere;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public void setDirectors(String directors) {
		this.directors = directors;
	}

	public void setCast(String cast) {
		this.cast = cast;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
}
