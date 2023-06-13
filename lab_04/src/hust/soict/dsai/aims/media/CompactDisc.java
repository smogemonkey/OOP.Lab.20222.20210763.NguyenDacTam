package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
    String artist;
    ArrayList<Track> tracks;

    public CompactDisc() {
        super();
    }

    public CompactDisc(int id, String title, String category, float cost, String director, int length) {
        this.setId(id);
        this.setTitle(title);
        this.setCategory(category);
        this.setCost(cost);
        this.setDirector(director);
        this.setLength(length);
    }

    public CompactDisc(String title) {
        this.setTitle(title);
    }


    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
        }
    }

    public void removeTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.remove(track);
        }
    }

    public int getLength() {
        return tracks.stream().mapToInt(Track::getLength).sum();
    }

    @Override
    public void play() {
        for (Track track : tracks) {
            track.play();
        }
    }
}
