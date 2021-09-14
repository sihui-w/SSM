package com.nic.service;

import com.nic.domain.Movies;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface IMoviesService {

    public List<Movies> findAll();

    //    根据id查询电影
    public Movies findMovieById(Integer id);

    //    增加电影
    public void addMovie(Movies movie);

    //    删除电影
    public void deleteMovieId(Integer id);

    //    修改电影信息
    public void modifyMovie(Movies movies);

}
