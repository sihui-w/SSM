package com.nic.test;


import com.nic.domain.Movies;
import com.nic.service.IMoviesService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestSpring {

    @Autowired
    private IMoviesService service;

//    查询所有
    @Test
    public void testFindAll(){
        List<Movies> movies=service.findAll();
        for(Movies movie:movies){
            System.out.println(movie);
        }
    }

//    根据id查询
@Test
    public void testFindMovieById(){
        Integer id =5;
        System.out.print(service.findMovieById(id));

    }

//    增加电影
    @Test
    public void testAddMovie(){
        Movies movie = new Movies();
        movie.setName("xiyou");
        movie.setDirector("chou");
        movie.setActor("chou");
        service.addMovie(movie);
    }

//    删除电影
    @Test
    public void testDeleteMovie(){
        Integer id=3;
        service.deleteMovieId(id);
    }

//    修改电影
    @Test
    public void testModifyMovie(){
        Movies movieById = service.findMovieById(2);
        movieById.setActor("kim,hou");
        service.modifyMovie(movieById);

    }

}


