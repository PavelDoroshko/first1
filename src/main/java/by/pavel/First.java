package by.pavel;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class First {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        ClassicalMusic music1 = context.getBean("musicBean1", ClassicalMusic.class);
        System.out.println("music1 " + music1.getSong());
        Music music2 = context.getBean("musicBean1", ClassicalMusic.class);
        System.out.println("music2 " + music2.getSong());
        System.out.println(music1 == music2);


        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        musicPlayer.playDifMusic();
        musicPlayer1.setName("one");
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer1 == musicPlayer);
        System.out.println(musicPlayer1.toString());
        System.out.println(musicPlayer.toString());
        context.close();
    }
}
