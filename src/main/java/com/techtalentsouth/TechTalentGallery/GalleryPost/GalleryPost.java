package com.techtalentsouth.TechTalentGallery.GalleryPost;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GalleryPost {
	@Id
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String title;
		private String artist;
		private String artDetails;
		
		public GalleryPost() {
			
		}
		
		public GalleryPost(String title, String artist, String artDetails) {
			this.title = title;
			this.artist = artist;
			this.artDetails = artDetails;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getArtist() {
			return artist;
		}

		public void setArtist(String artist) {
			this.artist = artist;
		}

		public String getArtDetails() {
			return artDetails;
		}

		public void setArtDetails(String artDetails) {
			this.artDetails = artDetails;
		}

		@Override
		public String toString() {
			return "GalleryPost [id=" + id + ", title=" + title + ", artist=" + artist + ", artDetails=" + artDetails
					+ "]";
		}
		
		

}
