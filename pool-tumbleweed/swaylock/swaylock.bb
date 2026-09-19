SUMMARY = "Screen locker for Wayland"
DESCRIPTION = "swaylock is a screen locking utility for Wayland compositors."
LICENSE = "MIT"

PV = "1.8.6"

RPM_NAME = "swaylock-1.8.6-1.2.aarch64.rpm"
RPM_HASH = "52cf510a5c0eeb5742d1219162675c078ea59c5178beeb82a94c1c1b441777df66dadcf497486be91abce949583004f5f4c1dbe0aefbcd9ab81cdd101e6ecba5"

RPROVIDES:${PN} += "swaylock"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libpam.so.0 \
libwayland-client.so.0 \
libxkbcommon.so.0"

inherit rpm
