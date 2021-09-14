package com.nic.service.impl;

import com.nic.dao.IMovieDao;
import com.nic.domain.Movies;
import com.nic.service.IMoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("moviesService")
public class MoviesServiceImpl implements IMoviesService {

    @Autowired
    private IMovieDao dao;

    @Override
    public List<Movies> findAll() {
        System.out.printf("movieimpl的findall方法执行了......");
        return dao.findAll();
    }

    @Override
    public Movies findMovieById(Integer id) {
        return dao.findMovieById(id);
    }

    @Override
    public void addMovie(Movies movie) {
        dao.addMovie(movie);
    }

    @Override
    public void deleteMovieId(Integer id) {
        dao.deleteMovieId(id);
    }

    @Override
    public void modifyMovie(Movies movies) {
        dao.modifyMovie(movies);
    }
}
