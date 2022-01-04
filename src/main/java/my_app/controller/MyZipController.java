package my_app.controller;

import my_app.dto.ZipCodeDto;
import my_app.service.ZipCodeService;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class MyZipController {

    @Autowired
    ZipCodeService zipService;

    @RequestMapping(value="/zip/list", method = RequestMethod.GET)
    public String zip(@RequestParam(name="zipcode", required=false) String zipcode) {

        if (zipcode == null || zipcode.equals("")) {
            return "errorMessage: 郵便番号を入力してください。";
        }

        // 郵便番号検索APIサービス呼び出し
        ZipCodeDto zipCodeDto = zipService.service(zipcode);

        System.out.println(zipCodeDto.getStatus());
        System.out.println(zipCodeDto.getMessage());
        System.out.println(zipCodeDto.getResults());
        return "OK";


    }
}