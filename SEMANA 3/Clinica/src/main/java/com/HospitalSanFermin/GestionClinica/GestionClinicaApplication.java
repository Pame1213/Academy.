package com.HospitalAngelesPedregal.GestionClinica;

import com.HospitalSanFermin.GestionClinica.Doctors.Doctor;
import com.HospitalSanFermin.GestionClinica.Doctors.DoctorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GestionClinicaApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionClinicaApplication.class, args);
    }


    @Bean
    CommandLineRunner initSlots(DoctorRepository doctor) {
        return args -> {
            if (doctor.count() == 0) {
                doctor.save(new Doctor("Ana", "Ramírez", "RAMA820305MX2", "5552223344", "ana.ramirez@mail.com", "Pediatría", true));
                doctor.save(new Doctor("Luis", "Martínez", "MALU790412XX3", "5553334455", "luis.martinez@mail.com", "Dermatología", true));
                doctor.save(new Doctor("Sofía", "Hernández", "HESO880623MX4", "5554445566", "sofia.hernandez@mail.com", "Neurología", true));
                doctor.save(new Doctor("Carlos", "Torres", "TOCA850715XX5", "5555556677", "carlos.torres@mail.com", "Ortopedia", true));
                doctor.save(new Doctor("María", "López", "LOMA900827MX6", "5556667788", "maria.lopez@mail.com", "Ginecología", true));
                doctor.save(new Doctor("Jorge", "Mendoza", "MEJO810109XX7", "5557778899", "jorge.mendoza@mail.com", "Psiquiatría", true));
                doctor.save(new Doctor("Valeria", "Cruz", "CRVA870213MX8", "5558889900", "valeria.cruz@mail.com", "Oftalmología", true));
                doctor.save(new Doctor("Fernando", "Ríos", "RIFE830324XX9", "5559990011", "fernando.rios@mail.com", "Urología", true));
                doctor.save(new Doctor("Patricia", "Gómez", "GOPA860506MX0", "5550001122", "patricia.gomez@mail.com", "Endocrinología", true));
                doctor.save(new Doctor("Ricardo", "Navarro", "NARI890718XX1", "5551112233", "ricardo.navarro@mail.com", "Oncología", true));
                );
            }
        };
    }
}



