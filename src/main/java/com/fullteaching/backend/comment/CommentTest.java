package com.fullteaching.backend.comment;

import com.fullteaching.backend.user.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommentTest {

    Comment comment;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        comment = new Comment("Mensagem aqui", 20296000, new User());
    }

    @Test
    void getMessage() {
        String msg = comment.getMessage();
        assertEquals("Mensagem aqui", msg);
    }

    @Test
    void getDate() {
        long date = comment.getDate();
        assertEquals(20296000, date);
    }
}