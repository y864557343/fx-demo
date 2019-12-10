package example;

import org.springframework.stereotype.Component;

/**
 * @ClassName: ImpActionService
 * @Description:
 * @author: 虞佳飞
 * @creatime: 2019/12/9 19:45
 */
@Component
public class ImpActionService implements ActionService {
    @Override
    public String processName(String name) {
        if(name.equals("Anton")) {
            return "Hello Anton!";
        }
        else {
            return "Hello Unknown Stranger!";
        }
    }
}
