package com.mindex.challenge.service;

import com.mindex.challenge.data.Compensation;

// this is used to fetch data from MongoDB database
//two interface are created related to compensation
public interface CompensationService {
    Compensation createCompensation(Compensation compensation);

    Compensation getCompensation(String id);
}