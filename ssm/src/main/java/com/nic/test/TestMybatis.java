package com.nic.test;

import com.nic.dao.IMovieDao;
import com.nic.domain.Movies;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestMybatis {

    @Autowired
    private IMovieDao dao;

//  查询所有电影
    @Test
    public void testFindAll(){
        List<Movies> movies=dao.findAll();
        for(Movies movie:movies){
            System.out.println(movie);
        }
    }

//    根据id查询电影
    @Test
    public void testFindMovieById(){
        Integer id=2;
        System.out.print(dao.findMovieById(id));
    }

//    增加电影
    @Test
    public void testAddMovie(){
        Movies movie = new Movies();
        movie.setActor("mandy");
        movie.setDirector("wong");
        movie.setName("beauty time");
        dao.addMovie(movie);
    }

//    删除电影
    @Test
    public void testDeleteMovie(){
        Integer id = 1;
        dao.deleteMovieId(id);
    }

//    修改电影
    @Test
    public void testModifyMovie(){
        Movies movie = dao.findMovieById(3);
        movie.setName("train");
        movie.setDirector("hong");
        movie.setActor("kim");
        dao.modifyMovie(movie);


    }
}
