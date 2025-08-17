package org.example.core.entity.enums;

public enum PatientStatus {

    STATUS_200(200, true),
    STATUS_210(210, true),
    STATUS_230(230, true),
    STATUS_300(300, false),
    STATUS_400(400, false);

    private final int code;
    private final boolean active;

    PatientStatus(int code, boolean active) {
        this.code = code;
        this.active = active;
    }

    public int getCode() {
        return code;
    }

    public boolean isActive() {
        return active;
    }

}

