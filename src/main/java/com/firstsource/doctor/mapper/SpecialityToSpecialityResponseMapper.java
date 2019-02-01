package com.firstsource.doctor.mapper;

import com.firstsource.doctor.domain.Speciality;
import com.firstsource.doctor.dto.response.SpecialityResponse;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SpecialityToSpecialityResponseMapper {
    public SpecialityResponse to(Speciality in) {
        if (in == null) {
            return null;
        }
        SpecialityResponse out = new SpecialityResponse();
        out.setId(in.getId());
        out.setTitle(in.getTitle());
        return out;
    }

    public List<SpecialityResponse> to(List<Speciality> in) {
        if (in == null) {
            return null;
        }
        List<SpecialityResponse> out = new ArrayList<>();
        for (Speciality s : in) {
            out.add(to(s));
        }
        return out;
    }

}
