SUMMARY = "Library for the hyprland cursor format"
DESCRIPTION = "Library for handling the hyprlang cursor format."
LICENSE = "BSD-3-Clause"

PV = "0.1.13"

RPM_NAME = "libhyprcursor0-0.1.13-1.6.aarch64.rpm"
RPM_HASH = "6353e2950deaabd0a05b7927ae80f8948bba3a9b28422f083816b6458e70a42cce7a629817f4ce0a14ff8133cbf02fe486241e9b1b913be4043e310046f387bd"

RPROVIDES:${PN} += "libhyprcursor.so.0 \
libhyprcursor0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgobject-2.0.so.0 \
libhyprlang.so.2 \
libm.so.6 \
librsvg-2.so.2 \
libstdc++.so.6 \
libtomlplusplus.so.3 \
libzip.so.5"

inherit rpm
