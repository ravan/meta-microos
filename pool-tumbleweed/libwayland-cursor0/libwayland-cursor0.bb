SUMMARY = "Wayland cursor library"
DESCRIPTION = "The purpose of this library is to be the equivalent of libXcursor in \
the X world. This library is compatible with X cursor themes and \
loads them directly into an shm pool making it easy for the clients \
to get buffer for each cursor image."
LICENSE = "MIT"

PV = "1.26.0"

RPM_NAME = "libwayland-cursor0-1.26.0-1.2.aarch64.rpm"
RPM_HASH = "bd6f6d7267e3547f8cfb3f6eace4db2f377dd59c8df1b1b7e54a4a6e98ae2bf14d9bdb9cb8ee199e7c19d6fa24870a9c5cd0e6e21e6acbc6a15098bd5a1c4992"

RPROVIDES:${PN} += "libwayland-cursor.so.0 \
libwayland-cursor0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libwayland-client.so.0"

inherit rpm
