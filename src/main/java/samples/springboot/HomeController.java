package samples.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by izeye on 15. 7. 17..
 */
@Controller
@RequestMapping(path = "/")
public class HomeController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String index() {
		return "index";
	}
	
}
