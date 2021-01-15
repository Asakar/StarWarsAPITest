package org.starwars.api.framework.dtos;

import java.util.List;

public class FilmsDTO extends StarWars {

    private int count;
    private Object next;
    private Object previous;
    private List<FilmDTO> results = null;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Object getNext() {
        return next;
    }

    public void setNext(Object next) {
        this.next = next;
    }

    public Object getPrevious() {
        return previous;
    }

    public void setPrevious(Object previous) {
        this.previous = previous;
    }

    public List<FilmDTO> getResults() {
        return results;
    }

    public void setResults(List<FilmDTO> results) {
        this.results = results;
    }
}
