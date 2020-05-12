package com.example.demo.controller;

import com.example.demo.services.PyDataService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@Api(description = "抓取数据")
@RestController
@RequestMapping("/pyData")
public class PyDataController {

    @Autowired
    private PyDataService pyDataService;



    @ResponseBody
    @PostMapping("/all")
    public Map findAllUser( @RequestParam(name = "name", required = false)
                   String name, @RequestParam(name = "iphone", required = false) String iphone,
                            @RequestParam(name = "city", required = false) String city){
        Map<String,Object> map = new HashMap<String,Object>();

        if (iphone.length() == 11) {
            try {
                pyDataService.adduser(name, iphone,city);
                map.put("success", true);
            } catch (Exception e) {
                e.printStackTrace();
                map.put("success", false);
            }
        }
        return map;
    }

}
