package by.pavel;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class First {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
       MusicPlayer music1 = context.getBean("musicPlayer", MusicPlayer.class);
       music1.playMusic();



        context.close();
    }
}
