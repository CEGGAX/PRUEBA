package com.iasolutions.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.iasolutions.demo.Model.comments;
import com.iasolutions.demo.Repository.commentsRepository;

@Service
public class commentsService {

    @Autowired
    private commentsRepository  CommentsRepository;

    public comments guardarComentario(comments comentario) {
        return CommentsRepository.save(comentario);
    }
}
