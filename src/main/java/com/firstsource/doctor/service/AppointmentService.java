package com.firstsource.doctor.service;

import com.firstsource.doctor.domain.*;
import com.firstsource.doctor.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Autowired
    private ClinicService clinicService;

    @Autowired
    private RegionService regionService;

    @Autowired
    private SpecialityService specialityService;

    public List<Appointment> findAvailable(String specialityId, String regionId, ZonedDateTime from, ZonedDateTime to) {
        Region region = regionService.find(regionId);
        Speciality speciality = specialityService.find(specialityId);
        List<Appointment> appointments = findAvailableIn(region, from, to);
        return appointments.stream().filter(appointment -> appointment.getDoctor().getSpecialities().contains(speciality)).collect(Collectors.toList());
    }

    private List<Appointment> findAvailableIn(Region region, ZonedDateTime from, ZonedDateTime to) {
        List<Clinic> clinics = clinicService.findByRegion(region);
        return appointmentRepository.findByClinicInAndStatusAndStartAfterAndEndBefore(clinics, AppointmentStatus.CREATED, from, to);
    }
}
