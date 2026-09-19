SUMMARY = "Library implementing a VNC server"
DESCRIPTION = "LibVNCServer/LibVNCClient are cross-platform C libraries that allow \
implementing VNC server or client functionality in your program."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.15"

RPM_NAME = "libvncserver1-0.9.15-4.1.aarch64.rpm"
RPM_HASH = "f650dad9cf1a35e996e372a988c68b7d8f8f733d28f754c0d9a7e31bc3a4014dae70c009358e1f57c3369023d1a23bb640a3c1984a0f866c04bb4a0edbd0ee11"

RPROVIDES:${PN} += "libvncserver.so.1 \
libvncserver1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libgnutls.so.30 \
libjpeg.so.8 \
liblzo2.so.2 \
libpng16.so.16 \
libz.so.1"

inherit rpm
