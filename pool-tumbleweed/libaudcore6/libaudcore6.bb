SUMMARY = "Main functionality library of Audacious"
DESCRIPTION = "Library from the Audacious audio player."
LICENSE = "BSD-2-Clause"

PV = "4.6.1"

RPM_NAME = "libaudcore6-4.6.1-1.3.aarch64.rpm"
RPM_HASH = "e2d469fe6c8587ffa57617b191b1c3f423afdf233ebe9a30f84e9d22af9b74541f031fdf127774f3cabdd20979ccb46369264f3315316a1155f8fa4ed6611d2c"

RPROVIDES:${PN} += "libaudcore \
libaudcore.so.6 \
libaudcore6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libm.so.6 \
libmvec.so.1 \
libstdc++.so.6"

inherit rpm
