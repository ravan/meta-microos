SUMMARY = "Qt 6 WaylandClient library"
DESCRIPTION = "The Qt 6 WaylandClient library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6WaylandClient6-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "6242aae1065d0c02047c8b5990e6dc9751bf798c4e0c7665508ee0920e21f134c78798508592696c7ab2fe8646770e8cd45394f1174547da932b1f95c7c7cc46"

RPROVIDES:${PN} += "libQt6WaylandClient.so.6 \
libQt6WaylandClient6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libstdc++.so.6 \
libwayland-client.so.0 \
libwayland-cursor.so.0 \
libxkbcommon.so.0"

inherit rpm
