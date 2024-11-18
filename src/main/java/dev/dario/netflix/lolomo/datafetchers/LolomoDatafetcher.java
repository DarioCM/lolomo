package dev.dario.netflix.lolomo.datafetchers;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import dev.dario.netflix.lolomo.codegen.types.Show;
import dev.dario.netflix.lolomo.codegen.types.ShowCategory;

import java.util.List;

@DgsComponent
public class LolomoDatafetcher {

    @DgsQuery
    public List<ShowCategory> lolomo(){
        return List.of(ShowCategory.newBuilder()
                .name("Top 10")
                .shows(
                        List.of(Show.newBuilder().title("Show 1").build())
                ).build());
    }





}
