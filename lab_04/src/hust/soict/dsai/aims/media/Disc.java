package hust.soict.dsai.aims.media;

public class Disc extends Media {
    protected int length;
    protected String director;

    public Disc() {
        super();
    }
    
    public Disc(String title) {
        this.setTitle(title);
    }

    public int getLength() {
        return length;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setLength(int length) {
        this.length = length;
    }

}