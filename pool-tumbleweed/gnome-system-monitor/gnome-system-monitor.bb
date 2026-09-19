SUMMARY = "A process monitor for the GNOME desktop"
DESCRIPTION = "GNOME-system-monitor is a process and system monitor for the GNOME \
Desktop. It shows you what programs are running and how much \
processor time, memory, and disk space are being used."
LICENSE = "GPL-2.0-or-later"

PV = "50.0"

RPM_NAME = "gnome-system-monitor-50.0-1.3.aarch64.rpm"
RPM_HASH = "3e25234367e3f803a09133b7b1af9b3329caf466aa64084f6db7dabf6ffd54285d7f8db3aa5bec579b1493984f1bf540a754d700db2c27fd259dd511dcc07446"

RPROVIDES:${PN} += "gnome-system-monitor"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libgiomm-2.68.so.1 \
libglib-2.0.so.0 \
libglibmm-2.68.so.1 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-4.so.1 \
libgtkmm-4.0.so.0 \
libgtop-2.0.so.11 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
librsvg-2.so.2 \
libsigc-3.0.so.0 \
libstdc++.so.6 \
libsystemd.so.0"

inherit rpm
