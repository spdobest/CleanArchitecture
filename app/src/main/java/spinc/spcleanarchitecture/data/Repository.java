package spinc.spcleanarchitecture.data;

import io.reactivex.Observable;
import spinc.spcleanarchitecture.model.Team;

import java.util.List;

public interface Repository {

  Observable<List<Team>> teamList();

  Observable<Team> team(final String flag);
}