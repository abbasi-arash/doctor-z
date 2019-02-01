package com.firstsource.doctor;

import com.firstsource.doctor.dto.request.DoctorRequest;
import com.firstsource.doctor.dto.response.DoctorResponse;
import com.firstsource.doctor.service.RegionService;
import com.firstsource.doctor.ws.DoctorFeign;
import feign.Feign;
import feign.Logger;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;
import feign.slf4j.Slf4jLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

/**
 * @author: Arash Abbasi (arash1abbasi@gmail.com)
 */
public class Console {

}
