SUMMARY = "Rice Video Plugin for the Mupen64plus Nintendo 64 Emulator"
DESCRIPTION = "This package contains the Rice Video Plugin for the Mupen64plus Nintendo 64 \
Emulator. It provides a high-level graphics emulation with support for \
high-resolution texture support."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.0"

RPM_NAME = "mupen64plus-plugin-video-rice-2.6.0-3.6.aarch64.rpm"
RPM_HASH = "ba0895d0ccd8c0568d36b4826839e205234cf4d297f905da4711d5a76d4264892dfd22fb3900b68dcd7994044aa379f92e9d5624c7a371eb5fe46868fb3e2ea0"

RPROVIDES:${PN} += "mupen64plus-plugin-video \
mupen64plus-plugin-video-rice"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6"

inherit rpm
