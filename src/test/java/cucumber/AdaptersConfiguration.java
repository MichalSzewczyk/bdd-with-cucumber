package cucumber;

import com.zoo.ducks.ports.Output;
import org.springframework.context.annotation.Bean;

import static org.mockito.Mockito.mock;

public class AdaptersConfiguration {
    @Bean
    Output output() {
        return mock(Output.class);
    }
}