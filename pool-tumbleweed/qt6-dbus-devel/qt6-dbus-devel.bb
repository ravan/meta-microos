SUMMARY = "Development files for the Qt 6 D-Bus library"
DESCRIPTION = "Development files for the Qt 6 D-Bus library. This package also \
contains Qt6's qdbusxml2cpp and qdbuscpp2xml binaries."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-dbus-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "2f83c4ddacf7425843be13ec4b30507b01a1e3584ab33d843266cf6d63e2fcb5d296bb5b781dc54a905655728c52d81faf1a9df76092280ccca03e7d304b6bfe"

RPROVIDES:${PN} += "cmake-Qt6DBus \
cmake-Qt6DBusTools \
pkgconfig-Qt6DBus \
qt6-dbus-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
libQt6DBus6 \
pkgconfig-Qt6Core"

inherit rpm
