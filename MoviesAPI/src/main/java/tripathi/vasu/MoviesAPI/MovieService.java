package tripathi.vasu.MoviesAPI;

import org.apache.catalina.util.ErrorPageSupport;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies() {

        return movieRepository.findAll();
    }
    public Optional <Movie> singleMovie(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
}
}