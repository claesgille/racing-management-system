package se.cag.labs.currentrace.services.sensors;

import java.util.HashMap;
import java.util.Map;

public enum RegisterSensorType {
    START("START"),
    MIDDLE("SPLIT"),
    FINISH("FINISH");

    private final String id;
    private static final Map<String, RegisterSensorType> lookup = new HashMap<>();

    static {
        for (RegisterSensorType type : RegisterSensorType.values()) {
            lookup.put(type.getId(), type);
        }
    }

    RegisterSensorType(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public static RegisterSensorType get(String id) {
        return lookup.get(id);
    }
}