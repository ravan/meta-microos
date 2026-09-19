SUMMARY = "3D Table Tennis Game"
DESCRIPTION = "CannonSmash is a 3D table tennis game. The goal of this project is to \
represent various table tennis strategies in a computer game."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.6"

RPM_NAME = "csmash-0.6.6-274.15.aarch64.rpm"
RPM_HASH = "5d854860888591c5617eb8555c8ec44e617897ad06201bf595175d8bfa866114175dd191f5fd0dacbf6b2728689e8cb5456fdaab24aa40e11ff2f3af4827accd"

RPROVIDES:${PN} += "csmash"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libSDL-1.2.so.0 \
libSDL-image-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
