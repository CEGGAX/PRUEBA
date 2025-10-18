package com.iasolutions.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iasolutions.demo.Model.comments;
import com.iasolutions.demo.Service.commentsService;

@RestController
@RequestMapping("/sendcomments")
@CrossOrigin(origins = "http://localhost:8080")
public class commentsController {

    @Autowired
    commentsService CommentsService;

    @PostMapping
    public ResponseEntity<String> enviarComentario(@RequestBody comments comentario) {
        CommentsService.guardarComentario(comentario);
        return ResponseEntity.ok("Comentario enviado exitosamente");
    }

}
