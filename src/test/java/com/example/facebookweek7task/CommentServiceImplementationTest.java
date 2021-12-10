package com.example.facebookweek7task;

import com.example.facebookweek7task.entity.Comment;
import com.example.facebookweek7task.entity.User;
import com.example.facebookweek7task.repositories.CommentRepository;
import com.example.facebookweek7task.repositories.PostRepository;
import com.example.facebookweek7task.serviceimplementation.CommentServiceImplementation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

class CommentServiceImplementationTest {

    @Mock
    private CommentRepository commentRepository;
    private PostRepository postRepository;
    private User user;

    @InjectMocks
    private CommentServiceImplementation postService;
    private Comment comment;
    @BeforeEach
    void setUp() {
        comment = new Comment();
      comment.setCommentBody("Hello");

    }

    @Test
    void shouldAddCommentTest() {
//        //mock userRepository
//        when(postRepository.save(any(Comment.class))).thenReturn(post);
//        //call the method to be tested
//        postService.addPost(user, post);
//        //Assertions
//        verify(postRepository, times(1)).save(post);

}
}