package com.example.demo;

import API.ComponentService;
import API.VehicleService;
import Model.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;

@SpringBootApplication
@Controller
public class DemoApplication implements CommandLineRunner {

    private ArrayList allComponents = new ArrayList();
    private ArrayList allVehicles = new ArrayList();

    VehicleService vehicleService = new VehicleService();
    ComponentService componentService = new ComponentService();

    @Override

    public void run(String... args) throws Exception {

        componentService.addCrawlerChassis(allComponents.size(), "IS3-M podvozok", 70000, 10, 60,0.5, allComponents);

        componentService.addLargeCaliberCannon(allComponents.size(), "122mm BL-9", 122.0, 0.6, 1.05, 2.0, allComponents);

        componentService.addLargeTurret(allComponents.size(), "IS3 veza", 30, 400, (LargeCaliberCannon)allComponents.get(1), allComponents);

        vehicleService.addHeavyTank(allVehicles.size(), "IS-3", Country.ZSSR, 300000, (CrawlerChassis)allComponents.get(0), (LargeTurret)allComponents.get(2), allVehicles);

    }

    @GetMapping("/")
    public String showIndex() {
        return "index";
    }

    @GetMapping("/vehicle/show/all")
    public String showAllVehicles(Model model) {
        model.addAttribute("vehicles", allVehicles.get(0));
        return "showAllVehicles";
    }

    @GetMapping("/component/show/all")
    public String showAllComponents(Model model) {
        model.addAttribute("components", allComponents);
        return "showAllComponents";
    }

    @GetMapping("/vehicle/show/{id}")
    public String showOnePerson(@PathVariable int id, Model model) {
        model.addAttribute("vehicle", allVehicles.get(id));
        return "showOneVehicle";
    }


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}

