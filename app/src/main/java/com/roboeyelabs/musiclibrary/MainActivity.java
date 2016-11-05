package com.roboeyelabs.musiclibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

import musiclibrary.roboeyelabs.com.music.PhoneMediaControl;
import musiclibrary.roboeyelabs.com.music.SongData;

public class MainActivity extends AppCompatActivity {

    public static ArrayList<SongData> song_list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        * get list of all songs from your phone
        * */
        song_list = PhoneMediaControl.getInstance().getList(MainActivity.this, 1, PhoneMediaControl.SonLoadFor.All, "");

        for (int i = 0; i < song_list.size(); i++) {
            System.out.println("song name --- " + song_list.get(i).getSongTitle());
            System.out.println("song artist --- " + song_list.get(i).getArtist());
            System.out.println("song duration --- " + song_list.get(i).getDuration());
            System.out.println("song path --- " + song_list.get(i).getSongPath());
            System.out.println("song album --- " + song_list.get(i).getAlbum());
            System.out.println("song album id --- " + song_list.get(i).getAlbumId());
            System.out.println("-----------------------------------------------------------");

        }
    }
}
