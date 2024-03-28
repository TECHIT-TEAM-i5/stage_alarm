package com.example.stagealarm.board.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/boards")
public class BoardViewController {
  @GetMapping
  public String boardView() {
    return "content/board/test";
  }
}
