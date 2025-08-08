package com.epam.mjc;

import java.util.List;
import java.util.Optional;
//import java.util.stream.Stream;

public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
       return list.stream().filter(t -> t % 2 == 0).toList();
        // throw new UnsupportedOperationException("You should implement this method.");
    }

    public List<String> toUpperCaseCollection(List<String> list) {
       return list.stream().map(x -> x.toUpperCase()).toList();
        // throw new UnsupportedOperationException("You should implement this method.");
    }

    public Optional<Integer> findMax(List<Integer> list) {
        return list.stream().max(Integer::compare);
        //throw new UnsupportedOperationException("You should implement this method.");
    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
        return list.stream().flatMap(x -> x.stream().min(Integer::compare).stream()).min(Integer::compare);
        //throw new UnsupportedOperationException("You should implement this method.");
    }

    public Integer sum(List<Integer> list) {
       return list.stream().reduce((x,y) -> x + y).get();
        // throw new UnsupportedOperationException("You should implement this method.");
    }
    
}
