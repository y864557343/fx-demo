package example;

import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName: Main
 * @Description:
 * @author: 虞佳飞
 * @creatime: 2019/12/9 17:48
 */
@SpringBootApplication
public class Main extends AbstractJavaFxApplicationSupport {
    public static void main(String[] args) {
        launch(Main.class,HelloWorldView.class,args);
    }
}
