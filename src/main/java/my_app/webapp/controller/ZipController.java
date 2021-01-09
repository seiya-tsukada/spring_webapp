package my_app.webapp.controller;

import javax.servlet.http.HttpSession;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import my_app.webapp.dto.ZipCodeDto;
import my_app.webapp.service.ZipCodeService;

@Controller
public class ZipController {

    @Autowired
	ZipCodeService zpcService; //I will confirm

    @RequestMapping("/zip")
    public String zip(HttpSession session, Model model) {
        return "zip";
    }

    @RequestMapping(value="/zip/confirm", method=RequestMethod.POST)
    public String zipcodeConfirm(HttpSession session, Model model, @RequestParam("zipcode") String zipcode) {


        // I will confirm
        ZipCodeDto zipCodeDto = zpcService.service(zipcode);

        // System.out.println(zipcode);
        // System.out.println(ToStringBuilder.reflectionToString(zipCodeDto));

        // thymeleafでリストを展開して表示する
        model.addAttribute("zipcodeList", zipCodeDto.getResults());

        return "zip-confirm";
    }

}