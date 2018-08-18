package visualsearch.service.main;


import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerResponse;
import org.springframework.web.reactive.function.server.ServerRequest;
import reactor.core.publisher.Mono;

/**
 * Created by dimitri on 18.08.18.
 */
@Component
public class MainResponseHandler  {
    public Mono<ServerResponse> handle(ServerRequest request) {
           return ServerResponse.ok().body(Mono.just("Hallo Welt"), String.class);
    }
}
