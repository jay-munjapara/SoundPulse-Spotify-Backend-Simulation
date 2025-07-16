package com.soundpulse.controller;

import com.soundpulse.service.AnalyticsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/analytics")
public class AnalyticsController {
    private final AnalyticsService analyticsService;

    public AnalyticsController(AnalyticsService analyticsService) {
        this.analyticsService = analyticsService;
    }

    @GetMapping("/top-tracks")
    public List<Map<String, Object>> getTopTracks() {
        return analyticsService.getTopTracks();
    }

    @GetMapping("/top-artists")
    public List<Map<String, Object>> getTopArtists() {
        return analyticsService.getTopArtists();
    }

    @GetMapping("/active-listeners")
    public List<Map<String, Object>> getActiveListeners() {
        return analyticsService.getActiveListeners();
    }
}
