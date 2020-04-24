package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by chaohui on 2020/4/23
 */
@Controller
public class CreatingController {

    @RequestMapping("/create")
    public String createWords(HttpServletRequest request, Model model){
        String keyWord1 = request.getParameter("theme1");
        String keyWord2 = request.getParameter("theme2");
        String AllText = keyWord1+keyWord2+"怎么回事呢？"+keyWord1+"相信大家都很熟悉，但是"+keyWord1+keyWord2
                +"是怎么回事呢？"+"下面就让小编带大家一起了解吧!"+keyWord1+"其实是不"+keyWord2+"的，"
                +"大家可能会很惊讶"+keyWord1+"怎么"+keyWord2+"呢？但事实就是这样，小编也感到非常惊讶。这就是关于"
                +keyWord1+keyWord2+"的事情了，大家有什么想法呢，欢迎在评论区告诉小编一起讨论哦！";
        model.addAttribute("allText",AllText);
        return "result";
    }
}
