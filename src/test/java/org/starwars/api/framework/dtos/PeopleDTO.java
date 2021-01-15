package org.starwars.api.framework.dtos;

import java.util.HashMap;
import java.util.List;

public class PeopleDTO extends StarWars {

    private int count;
    private String next;
    private Object previous;
    private List<PersonDTO> results;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public Object getPrevious() {
        return previous;
    }

    public void setPrevious(Object previous) {
        this.previous = previous;
    }

    public List<PersonDTO> getResults() {
        return results;
    }

    public void setResults(List<PersonDTO> results) {
        this.results = results;
    }
}
