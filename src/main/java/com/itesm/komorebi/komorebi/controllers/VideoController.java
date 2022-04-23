package com.itesm.komorebi.komorebi.controllers;

import com.itesm.komorebi.komorebi.models.Video;
import com.itesm.komorebi.komorebi.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/record")
public class VideoController {


    @Autowired
    VideoService videoService;

    //@PostMapping("/create-record")
    //public List<Video> createRecord(@RequestBody Video video){
        //return videoService.createRecord(video);
    //}

    //@PostMapping("/update-record")
    //public Video updateRecord(@RequestBody Video video){
        //return videoService.updateRecord(video);
    //}

    //@PostMapping("/delete-record")
    //public List<Video> deleteRecord(){
        //return videoService.deleteRecord();
    //}

    @GetMapping("/read-all")
    public List<Video> readRecord(){
        return videoService.readRecord();
    }

}
