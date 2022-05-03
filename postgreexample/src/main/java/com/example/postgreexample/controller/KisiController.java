package com.example.postgreexample.controller;

import com.example.postgreexample.Kisi;
import com.example.postgreexample.dto.KisiDto;
import com.example.postgreexample.repo.KisiRepository;
import com.example.postgreexample.service.KisiService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kisi")
public class KisiController {

    public KisiController(KisiService kisiService) {
        this.kisiService = kisiService;
    }

    private KisiService kisiService;

    @PostMapping
    public ResponseEntity<KisiDto> ekle(@RequestBody KisiDto kisi){
        return ResponseEntity.ok(kisiService.save(kisi));
    }
    @GetMapping
    public ResponseEntity <List<KisiDto>> listele (){
        return  ResponseEntity.ok(kisiService.getAll());
    }
}
