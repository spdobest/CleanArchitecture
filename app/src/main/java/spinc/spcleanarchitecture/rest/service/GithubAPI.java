package spinc.spcleanarchitecture.rest.service;

import android.support.v7.util.SortedList;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import spinc.spcleanarchitecture.model.github.RepositoryResponse;
import spinc.spcleanarchitecture.rest.model.ApiResponse;

public interface GithubAPI {
    @GET("/repositories")
    Call<RepositoryResponse> getAllRepository(@Query("q") String strCity, SortedList.Callback<ApiResponse> callback);

}
