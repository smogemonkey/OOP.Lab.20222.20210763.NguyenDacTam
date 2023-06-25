package hust.soict.dsai.aims.media;

import java.util.ArrayList;
//import hust.soict.dsai.aims.media.Track;
import hust.soict.dsai.aims.exception.PlayerException;
import hust.soict.dsai.aims.exception.DataConstraintsException;

public class CompactDisc extends Disc implements Playable {

	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();
	
	public CompactDisc() {
		// TODO Auto-generated constructor stub
	}
	
	public CompactDisc(String title, String artist) {
		this(title);
		this.setArtist(artist);
	}
	
	
	public CompactDisc(String title){
		super(title);
	}
	
	public CompactDisc(String title, String category, float cost) throws DataConstraintsException {
		this(title);
		this.setCategory(category);
		this.setCost(cost);
	}
	
	
	public void addTrack(Track newTrack) {
		if(this.tracks.contains(newTrack)) {
			System.out.println("Track already exists!");
			return ;
		}
		this.tracks.add(newTrack);
		System.out.println("Track is added!");
	}
	public void removeTrack(Track track) {
		if(this.tracks.contains(track)) {
			this.tracks.remove(track);
			System.out.println("Track is removed!");
			return ;
		}
		System.out.println("Track does not exist!");
	}
	public void play() throws PlayerException {
		System.out.println(String.format("CD %s from artist %s\nThis CD contains %dtracks",
										  this.getTitle(), this.artist, this.tracks.size()));
		if (this.getLength() > 0) {
			for (Track t: tracks) {
				try {
					t.play();
				} catch (PlayerException e) {
					throw e;
				}
			}
		}
		else {
			throw new PlayerException("ERROR: CD length is non-positive!");
		}
	}
	
	@Override
	public int getLength() {
		int sum = 0;
		for(Track track: tracks) {
			sum += track.getLength();
		}
		return sum;
	}
	
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
//	public ArrayList<Track> getTrack() {
//		return track;
//	}
//	public void setTrack(ArrayList<Track> track) {
//		this.track = track;
//	}
	
	@Override
	public String toString() {
		return ("CD - " + this.getTitle() 
		+ " - " + this.getCategory()
		+ " - " + this.getDirector()
		+ " - " + this.getLength()
		+ ": " + this.getCost() + "$");
	}

	public ArrayList<Track> getTracks() {
		return tracks;
	}

	public void setTracks(ArrayList<Track> tracks) {
		this.tracks = tracks;
	}

}
