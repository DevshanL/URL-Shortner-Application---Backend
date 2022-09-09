package controller;

import service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UrlController {

    @Autowired
    private  UrlService urlService;

    @GetMapping("/{id}")
    public String getOriginlUrl(@PathVariable String id) {
        return urlService.getOriginlUrl(id);
    }

    @PostMapping("/test")
    public String generateShortUrl(@RequestBody String url) {
       return "tet";
    	
       
       
       // return urlService.generateShortUrl(url);
    }

}
