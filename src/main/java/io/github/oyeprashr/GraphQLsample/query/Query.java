package io.github.oyeprashr.GraphQLsample.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {

    public String test(){
        return "Hello from inside class Query";
    }

    public int add(int a, int b){
        return a + b;
    }

}
