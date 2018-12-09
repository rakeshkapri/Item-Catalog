package com.example.ItemCatalog;

import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
    @RequestMapping(value = "/item", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public String getItem(){
        return "Item from Item Service";
    }
}
