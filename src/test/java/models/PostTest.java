package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;

import static org.junit.Assert.*;

public class PostTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void PostIntanstiatesCorrectly_true(){
        Post post = new Post(1,"t1","c1",new SimpleDateFormat("12/12/2012"));
        assertEquals(true,post instanceof Post);
    }

    @Test
    public void PostInstanctiatesWithTitle_true(){
        Post post = new Post(1,"t1","c1",new SimpleDateFormat("12/12/2012"));
        assertEquals("t1",post.getTitle() );
    }

    @Test
    public void PostInstatiatesWithContent_true(){
        Post post = new Post(1,"t1","c1",new SimpleDateFormat("12/12/2012"));
        assertEquals("c1",post.getContent() );
    }

    @Test
    public void AllPostsAreReturned_true(){
        Post post1 = new Post(1,"t1","c1",new SimpleDateFormat("12/12/2012"));
        Post post2 = new Post(2,"t2","c2",new SimpleDateFormat("12/12/2012"));
        assertEquals(2,Post.getAll().size());
    }

    @Test void AllPostsContainAllPosts_true(){
        Post post1 = new Post(1,"t1","c1",new SimpleDateFormat("12/12/2012"));
        Post post2 = new Post(2,"t2","c2",new SimpleDateFormat("12/12/2012"));
        assertTrue(Post.getAll().contains(post1));
        assertTrue(Post.getAll().contains(post2));
    }

    @Test
    public void deletesSpecificPost_true(){
        Post post1 = new Post(1,"t1","c1",new SimpleDateFormat("12/12/2012"));
        Post post2 = new Post(2,"t2","c2",new SimpleDateFormat("12/12/2012"));
        post1.deletePost();
        assertTrue(Post.getAll().get(0).equals(post2));

    }

    @Test
    public void deletesAllPosts_true(){
        Post post1 = new Post(1,"t1","c1",new SimpleDateFormat("12/12/2012"));
        Post post2 = new Post(2,"t2","c2",new SimpleDateFormat("12/12/2012"));
        Post.deleteAllPosts();
        assertEquals(0,Post.getAll().size());
    }

    @Test
    public void SetsTitleCorrectlty_true(){
        Post post = new Post(1,"t1","c1",new SimpleDateFormat("12/12/2012"));
        post.setTitle("new title");
        assertEquals("new title",post.getTitle());
    }

    @Test
    public void SetsContentCorrectlty_true(){
        Post post = new Post(1,"t1","c1",new SimpleDateFormat("12/12/2012"));
        post.setContent("new content");
        assertEquals("new content",post.getContent());
    }
}