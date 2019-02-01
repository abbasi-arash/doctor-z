package com.firstsource.doctor.mapper;

import com.firstsource.doctor.domain.Region;
import com.firstsource.doctor.dto.response.RegionResponse;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RegionToRegionResponseMapper {
    public RegionResponse to(Region in) {
        if (in == null) {
            return null;
        }
        RegionResponse out = new RegionResponse();
        out.setId(in.getId());
        out.setTitle(in.getTitle());
        return out;
    }

    public List<RegionResponse> to(List<Region> in) {
        if (in == null) {
            return null;
        }
        List<RegionResponse> out = new ArrayList<>();
        for (Region s : in) {
            out.add(to(s));
        }
        return out;
    }

}
