package ua.lviv.iot.zoosbackend.model.enums;

import java.util.Set;

public enum Role {
    USER(Set.of(Permission.ZOOS_READ)),
    ADMIN(Set.of(Permission.ZOOS_READ, Permission.ZOOS_WRITE));

    private final Set<Permission> permissions;

    Role(Set<Permission> permissions) {
        this.permissions = permissions;
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }
}
