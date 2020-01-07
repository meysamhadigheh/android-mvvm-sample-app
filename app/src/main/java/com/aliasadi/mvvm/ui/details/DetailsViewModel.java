package com.aliasadi.mvvm.ui.details;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.content.Intent;

import com.aliasadi.mvvm.data.network.model.Movie;


/**
 * Created by Ali Asadi on 12/03/2018.
 */
class DetailsViewModel extends ViewModel {

    private MutableLiveData<Movie> movieLiveData = new MutableLiveData<>();
    private Movie movie;

    DetailsViewModel(Movie movie) {
        this.movie = movie;
    }

    void loadMovieData() {
        movieLiveData.postValue(movie);
    }

    MutableLiveData<Movie> getMovie() {
        return movieLiveData;
    }
}
