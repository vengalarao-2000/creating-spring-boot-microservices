package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.tourservice.TourManagementService;
import com.example.tourservice.TravelAgentService;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class.getPackageName());
        TravelAgentService agent = context.getBean(TravelAgentService.class);

        // Pull the TourManagementService object
        TourManagementService tourManagementService = context.getBean(TourManagementService.class);
        tourManagementService.createTour("Zoo Tour", 500, true);

        System.out.println("\n******Explore California Tour Catalogue******");
        agent.displayTours();

        System.out.println("\n******Explore California Tour Kid Friendly Tours******");
        agent.displayToursBy(true);
    }
}