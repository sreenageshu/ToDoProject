package com.todo.model.todo;

import java.util.Date;

/**
 * Created by suppulur on 2/19/2015.
 */
public class TaskList {
    private int taskListID;
    private int taskID;
    private String taskDescription;
    private Date taskDate;
    private String status;
    private double spentAmount;

    public TaskList() {
    }

    public TaskList(int taskListID, int taskID, String taskDescription, Date taskDate, String status, double spentAmount) {
        this.taskListID = taskListID;
        this.taskID = taskID;
        this.taskDescription = taskDescription;
        this.taskDate = taskDate;
        this.status = status;
        this.spentAmount = spentAmount;
    }

    public int getTaskListID() {
        return taskListID;
    }

    public void setTaskListID(int taskListID) {
        this.taskListID = taskListID;
    }

    public int getTaskID() {
        return taskID;
    }

    public void setTaskID(int taskID) {
        this.taskID = taskID;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public Date getTaskDate() {
        return taskDate;
    }

    public void setTaskDate(Date taskDate) {
        this.taskDate = taskDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getSpentAmount() {
        return spentAmount;
    }

    public void setSpentAmount(double spentAmount) {
        this.spentAmount = spentAmount;
    }
}
