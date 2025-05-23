package com.zerck.postApp.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
@Log4j2
public class MainController {

    @GetMapping("/main")
    public void main(){
        log.info("[GET] MainController.main");

    }
}
