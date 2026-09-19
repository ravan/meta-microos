SUMMARY = "Development files for gtk-session-lock"
DESCRIPTION = "Development files and headers for gtk-session-lock"
LICENSE = "GPL-3.0 & MIT"

PV = "0.2.0"

RPM_NAME = "gtk-session-lock-devel-0.2.0-1.10.aarch64.rpm"
RPM_HASH = "e8be1c554652dd4e24114193af857a90f6f3c991fa983f91d32286a2fc05be2e460094b65ec16786250382d70da872a9faaee7e9ff5ec8a1d7fb0e488fffeb0f"

RPROVIDES:${PN} += "gtk-session-lock-devel \
pkgconfig-gtk-session-lock-0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgtk-session-lock0 \
pkgconfig-gtk+-3.0 \
pkgconfig-wayland-client \
typelib-1-0-GtkSessionLock-0-1"

inherit rpm
