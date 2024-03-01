package com.birthdayreminder;
public class Main {
    public static void main(String[] args) {

        ReminderManager reminderManager = new ReminderManager();

        reminderManager.addBirthday();
        reminderManager.loadData();
        reminderManager.checkBirthday();
    }
}
