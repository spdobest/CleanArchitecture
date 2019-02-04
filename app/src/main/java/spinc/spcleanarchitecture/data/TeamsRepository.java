package spinc.spcleanarchitecture.data;

import android.support.annotation.NonNull;
import io.reactivex.Observable;
import spinc.spcleanarchitecture.model.Team;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.sql.DataSource;
import java.util.List;

@Singleton
public class TeamsRepository implements Repository {

    private final TeamToTeamEntityMapper teamToTeamEntityMapper;
    private final DataSource dataSource;

    @Inject
    TeamsRepository(@NonNull TeamDataSourceFactory teamDataSourceFactory,
                    @NonNull TeamToTeamEntityMapper teamToTeamEntityMapper) {
        this.teamToTeamEntityMapper = teamToTeamEntityMapper;
        this.dataSource = teamDataSourceFactory.createDataSource();
    }

    @Override
    public Observable<List<Team>> teamList() {
        return dataSource.teamEntityList().map(teamToTeamEntityMapper::reverseMap);
    }

    @Override
    public Observable<Team> team(String flag) {
        return dataSource.teamEntity(flag).map(teamToTeamEntityMapper::reverseMap);
    }

}