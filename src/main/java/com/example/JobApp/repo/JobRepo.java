package com.example.JobApp.repo;

import com.example.JobApp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Repository
public class JobRepo {

    List<JobPost> jobs=new ArrayList<>(Arrays.asList(
            new JobPost(1,"Java Developer","Must have 2 years of exp",3, Collections.singletonList("JAVA")),
            new JobPost(2,"React Developer","Must have 2 years of exp",3, Collections.singletonList("JAVA"))

    )

    );
    public List<JobPost> getAllJobs(){
        return jobs;
    }

    public void addJob(JobPost job){
        jobs.add(job);
        System.out.println(jobs);
    }
}
