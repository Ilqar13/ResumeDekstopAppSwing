/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.resume;

import com.company.entity1.EmploymentHistory;
import com.company.entity1.User;
import com.company.main.Context;


public class Config{
    public static volatile User loggedInUser=Context.instanceUserDao().getById("6");
    public static volatile EmploymentHistory employmentHistoryAboutUser;
}
