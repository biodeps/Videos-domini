package domain;

import java.util.*;
import domain.Video;

public class Usuari {
	private String idUser = "";
	private String name = "";
	private String lastName = "";
	private String password = "";
	private GregorianCalendar registryDate = new GregorianCalendar();
	private List<Video> videoList= new ArrayList<>();

	public Usuari(){
		
	}

	private void creaVideo() {
		videoList.add(new Video("Untitled video"));
	}
	
}
