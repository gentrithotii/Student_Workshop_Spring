package com.gentrit.util;

import com.gentrit.config.ScannerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ScannerInputService implements UserInputService {
    private ScannerConfig scInput;

    @Autowired
    public ScannerInputService(ScannerConfig scInput) {
        this.scInput = scInput;
    }

    @Override
    public String getString() {
        return scInput.getScanner().nextLine();
    }

    @Override
    public int getInt() {
        return scInput.getScanner().nextInt();
    }
}
