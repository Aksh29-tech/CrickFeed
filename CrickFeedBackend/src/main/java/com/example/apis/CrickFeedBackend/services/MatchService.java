package com.example.apis.CrickFeedBackend.services;

import com.example.apis.CrickFeedBackend.entities.Match;

import java.util.List;
import java.util.Map;

public interface MatchService {
    List<Match> getAllMatches();

    List<Match> getLiveMatches();

    List<Map<String, String>> getPointTable();
}
