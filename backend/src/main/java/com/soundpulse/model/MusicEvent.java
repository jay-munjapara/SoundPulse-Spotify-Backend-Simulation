package com.soundpulse.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class MusicEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userId;
    private String trackName;
    private String artistName;
    private LocalDateTime playedAt;

    // Getters and Setters
}
