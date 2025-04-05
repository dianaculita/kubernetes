package com.lib.library.service;

import com.lib.library.dto.Library;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class LibraryService {

    public Library getLibraryById(String id) {
        return new Library("1", "lib", "street number");
    }
}
