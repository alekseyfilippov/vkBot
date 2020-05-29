package ru.onbattle.vkBot.dao.domain;

import ru.onbattle.vkBot.core.State;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author abnormes on 27.05.2020
 * @project vkBot
 */
public class Guest {

    private Integer id;
    private State state;
    private Boolean isUser;
    private String name;
    private Integer rating;
    private University university;
    private List<Task> taskList;
    private Game game;
    private static Map<Integer, Guest> guests = new HashMap<>();

    public Guest(Integer id, State state, Boolean isUser) {
        this.id = id;
        this.state = state;
        this.isUser = isUser;
    }

    public static Map<Integer, Guest> getGuests() {
        return guests;
    }

    public static Guest getGuestById(int id) {
        return guests.get(id);
    }

    public void buildUser() {
        this.isUser = true;
        /** DAO send to DB */
    }

    public Boolean isUser() {
        return isUser;
    }

    public void setUser(Boolean user) {
        isUser = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
