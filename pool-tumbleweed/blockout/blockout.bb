SUMMARY = "A free clone of the original BlockOut DOS game"
DESCRIPTION = "BlockOut II is a free adaptation of the original BlockOut DOS game \
edited by California Dreams in 1989. BlockOut II has the same \
features than the original game with few graphic improvements. The \
game has been designed to reproduce the original game kinematics as \
accurately as possible."
LICENSE = "GPL-2.0-only"

PV = "2.5"

RPM_NAME = "blockout-2.5-4.2.aarch64.rpm"
RPM_HASH = "18f274a1f12a1a5d46e24b0409e567017e85c9a4365a0422f43ba9fadcda66ceb5a68fb92d827ce6dc0c8138eabfd0d232e3a93a4340a79025dc3869a83ea7a9"

RPROVIDES:${PN} += "blockout"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libSDL-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6"

inherit rpm
