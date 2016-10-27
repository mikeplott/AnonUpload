package com.theironyard.services;

import com.theironyard.entities.AnonFile;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by michaelplott on 10/27/16.
 */
public interface AnonFileRepo extends CrudRepository<AnonFile, Integer> {
}
