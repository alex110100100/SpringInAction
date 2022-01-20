package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component                                      //Tells Spring to create a CD Player bean (if a component scan is a used)
public class CDPlayer implements MediaPlayer {
   private CompactDisc cd;

   @Autowired                                   //Tells Spring to fetch a CompactDisc Bean from the Application Context
   public CDPlayer(CompactDisc cd) {            //and pass it into the constructor
      this.cd = cd;
   }

   public void play() {
      cd.play();
   }
}