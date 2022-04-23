package com.itesm.komorebi.komorebi.service;

import com.itesm.komorebi.komorebi.models.Video;
import com.itesm.komorebi.komorebi.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoService {
    @Autowired
    VideoRepository videoRepository;


    //public List<Video> createRecord(Video video){
        //return videoRepository.createVideo(video);
    //}

    //public Video updateRecord(Video video){
        //videoRepository.updateVideoURL(video);
        //return video;
    //}

    //public List deleteRecord(){
        //return videoRepository.deleteVideo();
    //}

    public List<Video> readRecord(){
        return videoRepository.findAll();
    }
}
