package soundsystem;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)        //Have Spring create an Application Context
@ContextConfiguration(classes= CDBeans.class)  //and load its config from the CDBeans class
public class CDPlayerTest
{
   @Autowired                                  //Finds a bean whose class implemented CompactDisc
   private CompactDisc cd;

   @Test
   public void cdShouldNotBeNull() {
      assertNotNull(cd);
   }
}