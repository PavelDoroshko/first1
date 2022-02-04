package by.pavel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class MusicPlayer {
    @Autowired
    private Music music;
    private String name;
    private int volume;
    private List<Music> musicList = new ArrayList<>();


    public MusicPlayer() {
    }

    public MusicPlayer(Music music) {
        this.music = music;
    }


   public void  playMusic(){
        System.out.println("playing "+ music.getSong());
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }
    public  void  playDifMusic(){
      for(Music music : musicList){
          System.out.println(music.getSong());
      }
    }
}
