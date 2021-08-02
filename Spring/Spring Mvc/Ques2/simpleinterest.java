package webmvcQ2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class simpleInterst{
	
	@RequestMapping("/calulate")
	public ModelAndView add( HttpServletRequest request ,   HttpServletResponse response   )
	{
		double am = Integer.parseInt(request.getParameter("amount"));
	    double ti = Integer.parseInt(request.getParameter("years"));
	    double in =  Integer.parseInt(request.getParameter("interest"));
	    
	    double pr = (am*ti*in)/100;
	    ModelAndView ob = new ModelAndView();
	    ob.setViewName("display.jsp");
	    ob.addObject("result", pr);
	    
	    return ob;
	}

}
