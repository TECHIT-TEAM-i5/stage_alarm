package com.example.stagealarm.show.controller;

import com.example.stagealarm.show.dto.ShowLikeResponseDto;
import com.example.stagealarm.show.service.ShowLikeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/show/{id}/like")
@RequiredArgsConstructor
public class ShowLikeController {
    private final ShowLikeService showLikeService;

    @PostMapping
    public ResponseEntity<ShowLikeResponseDto> create(@PathVariable("id") Long showInfoId) {
        ShowLikeResponseDto dto = showLikeService.insertShowLike(showInfoId);
        return ResponseEntity.ok().body(dto);
    }

    @DeleteMapping
    public ResponseEntity<Void> delete(@PathVariable("id") Long showInfoId) {
        showLikeService.deleteShowLike(showInfoId);
        return ResponseEntity.noContent().build();
    }
}
