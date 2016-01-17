package ski.puchal.numbers.home;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getContent(Model model) {
		model.addAttribute("bean", new SearchBean());
		return "frame";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String getContentPost(@Valid @ModelAttribute("bean") SearchBean bean, BindingResult bindingResult) {
		bindingResult.addError(new ObjectError("bean", "Not implemented yet"));
		return "frame";
	}
	
}
