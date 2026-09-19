SUMMARY = "Hard Disk Health Inspection Tool"
DESCRIPTION = "GSmartControl is a graphical user interface for smartctl, which is a tool for \
querying and controlling SMART (Self-Monitoring, Analysis, and Reporting \
Technology) data in hard disk drives. It allows inspecting the drive's \
SMART data to determine its health, as well as run various tests on it."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "2.0.2"

RPM_NAME = "gsmartcontrol-2.0.2-2.7.aarch64.rpm"
RPM_HASH = "69d4d10918d033beacb15a2565632d25c744301d9e22eb81354c286509f3d37ea8576032d31c46fe342bc20993dd5ec1fe9f1b9ea553053992d29f0d4c613c63"

RPROVIDES:${PN} += "gsmartcontrol"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libatkmm-1.6.so.1 \
libc.so.6 \
libcairo.so.2 \
libcairomm-1.0.so.1 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdkmm-3.0.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtkmm-3.0.so.1 \
libpangomm-1.4.so.1 \
libsigc-2.0.so.0 \
libstdc++.so.6 \
polkit \
smartmontools"

inherit rpm
