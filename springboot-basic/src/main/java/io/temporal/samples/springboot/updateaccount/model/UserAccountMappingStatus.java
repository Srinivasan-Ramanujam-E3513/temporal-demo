package io.temporal.samples.springboot.updateaccount.model;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum UserAccountMappingStatus {
    MAPPING_FAILED("MAPPING_FAILED"),
    MAPPING_EXISTS("MAPPING_EXISTS"),
    NOT_MAPPED("NOT_MAPPED"),
    MAPPED("MAPPED");

    @NonNull
    private String status;


    public String getStatus() {
        return this.status;
    }
}
