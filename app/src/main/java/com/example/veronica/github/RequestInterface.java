package com.example.veronica.github;

import com.example.Github;

import java.util.List;


import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RequestInterface {
    @GET("repos/{user}/{repo}/issues")
    Observable<List<Github>> listRepoIssues(
            @Path("user") String user,
            @Path("repo") String repo);
}








