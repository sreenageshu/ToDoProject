package com.todo.model.todo;

import java.util.Date;

/**
 * Created by suppulur on 2/19/2015.
 */
public class TaskMain {
    private int taskID;
    private String taskTitle;
    private Date startDate, expectedDate, actualDate;
    private int priority;
    private double expectedTotalBudget, actualBudget;
    public TaskMain() {
    }

    public TaskMain(int taskID, String taskTitle, Date startDate, Date expectedDate, Date actualDate, int priority, double expectedTotalBudget, double actualBudget) {
        this.taskID = taskID;
        this.taskTitle = taskTitle;
        this.startDate = startDate;
        this.expectedDate = expectedDate;
        this.actualDate = actualDate;
        this.priority = priority;
        this.expectedTotalBudget = expectedTotalBudget;
        this.actualBudget = actualBudget;
    }

    public int getTaskID() {
        return taskID;
    }

    public void setTaskID(int taskID) {
        this.taskID = taskID;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getExpectedDate() {
        return expectedDate;
    }

    public void setExpectedDate(Date expectedDate) {
        this.expectedDate = expectedDate;
    }

    public Date getActualDate() {
        return actualDate;
    }

    public void setActualDate(Date actualDate) {
        this.actualDate = actualDate;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public double getExpectedTotalBudget() {
        return expectedTotalBudget;
    }

    public void setExpectedTotalBudget(double expectedTotalBudget) {
        this.expectedTotalBudget = expectedTotalBudget;
    }

    public double getActualBudget() {
        return actualBudget;
    }

    public void setActualBudget(double actualBudget) {
        this.actualBudget = actualBudget;
    }
}
