SUMMARY = "A clone of the Commander Keen engines"
DESCRIPTION = "Commander Genius is a software piece that interprets the Commander \
Keen Vorticon (1-3) and Galaxy (3½-6) series. \
 \
It has 4-player cooperative mode and six difficulty modes."
LICENSE = "GPL-2.0-only"

PV = "3.6.3"

RPM_NAME = "commandergenius-3.6.3-1.2.aarch64.rpm"
RPM_HASH = "493f5c7982358130d43aa0b1e5596ae33554a3099f6615fbf8c78f80d664e5d483f5a0dc4f9f6dbb9ac1d580f34b7e22337dfd2f7ddee90f61b7cac19838bdc2"

RPROVIDES:${PN} += "commandergenius"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libSDL2-ttf-2.0.so.0 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
