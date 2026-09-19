SUMMARY = "Pulse audio bridge for VNC client connections"
DESCRIPTION = "gtk-vnc is a VNC viewer widget for GTK+. It is built using coroutines \
allowing it to be completely asynchronous while remaining single \
threaded. \
 \
This package contains the Pulse audio bridge for VNC client connections."
LICENSE = "LGPL-2.1-only & LGPL-2.1-or-later"

PV = "1.5.0"

RPM_NAME = "libgvncpulse-1_0-0-1.5.0-5.2.aarch64.rpm"
RPM_HASH = "62960b1dc827c3d9d5927e445b75471093354a2825746443b6ea4d1257b2d5b2ef7e2149813edb4d024e0de0d4d83b63bd7af642ad2af0ed574e581c8f3b2aec"

RPROVIDES:${PN} += "libgvncpulse-1-0-0 \
libgvncpulse-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgvnc-1.0.so.0 \
libpulse-simple.so.0 \
libpulse.so.0"

inherit rpm
