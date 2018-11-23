package domain;

import java.util.*;

public class Video {
	private String url = "";
	private String title = "";
	private List<String> tagList= new ArrayList<>();
	private String idUserWhoCreatedMe = "";
	private List<Video> videoList= new ArrayList<>();
	
	public Video(String title) {
		this.title = title;
	}
	
	public Video getVideo(String idUser) {
		if (idUser == idUserWhoCreatedMe) {
			return this;
		} else {
			return new Video("");
		}
	}
	
	public List<Video> getVideoList() {
		return videoList;
	}
	
	public void setVideo (String idUser) {
		videoList.add(new Video(idUser));
	}
	
}
