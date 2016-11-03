package musiclibrary.roboeyelabs.com.music;

import android.graphics.Bitmap;

import java.io.Serializable;
import java.util.ArrayList;

public class SongData implements Serializable {

    private String songTitle;
    private String songPath;
    private String songIndex, artist;
    private String album;
    private int id;
    private long duration;
    private long albumId;

    public SongData(String songTitle, String songPath, String songIndex, String artist, int id, long duration, long albumId, String album) {
        this.songTitle = songTitle;
        this.songPath = songPath;
        this.songIndex = songIndex;
        this.artist = artist;
        this.id = id;
        this.duration = duration;
        this.album = album;
        this.albumId = albumId;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public long getAlbumId() {
        return albumId;

    }

    public void setAlbumId(long albumId) {
        this.albumId = albumId;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }


    public String getSongIndex() {
        return songIndex;
    }

    public void setSongIndex(String songIndex) {
        this.songIndex = songIndex;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public String getSongPath() {
        return songPath;
    }

    public void setSongPath(String songPath) {
        this.songPath = songPath;
    }
}
