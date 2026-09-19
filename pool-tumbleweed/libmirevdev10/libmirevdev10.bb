SUMMARY = "Evdev support for Mir"
DESCRIPTION = "evdev support library for the Mir server platform"
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "2.28.0"

RPM_NAME = "libmirevdev10-2.28.0-1.3.aarch64.rpm"
RPM_HASH = "8dad3ef2ed80b2992e674c61494ca3f4ff91923cadb699308e32a09c7a584f10e1422ec7c970f68a6763f7829047d22174d0f7b6d3f22fa6ddb3de6ac14140f6"

RPROVIDES:${PN} += "libmirevdev10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libinput.so.10 \
libm.so.6 \
libmircommon.so.12 \
libmircore.so.2 \
libmirplatform.so.34 \
libstdc++.so.6 \
libudev.so.1"

inherit rpm
