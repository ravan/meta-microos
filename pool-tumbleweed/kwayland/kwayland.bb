SUMMARY = "KDE Wayland library"
DESCRIPTION = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "kwayland-5.116.0-2.10.aarch64.rpm"
RPM_HASH = "d4fbc734e4a32ff3a51b1c8727d26d2f98a5d4f25a4a51fe5ae16cb84478878719f8c90898dce305e968992e5c642624fa1fb5b85df972e6f276575a8853a171"

RPROVIDES:${PN} += "kwayland \
libKF5WaylandClient.so.5 \
libKF5WaylandClient5 \
libKF5WaylandServer5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Gui5 \
libQt5WaylandClient.so.5 \
libc.so.6 \
libstdc++.so.6 \
libwayland-client.so.0"

inherit rpm
