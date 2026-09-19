SUMMARY = "Mir Wayland library"
DESCRIPTION = "Component library of the Mir compositing stack"
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "2.28.0"

RPM_NAME = "libmirwayland6-2.28.0-1.3.aarch64.rpm"
RPM_HASH = "a1713811ce86ca1b2e74990b32fe9efda26d68b831a017e5bcd59d858a5987a974817922adb869f5c0aabcc1b59bb0b1196e2ba1ceaae6f75c9db9f8077adc37"

RPROVIDES:${PN} += "libmirwayland.so.6 \
libmirwayland6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmircore.so.2 \
libstdc++.so.6 \
libwayland-server.so.0"

inherit rpm
