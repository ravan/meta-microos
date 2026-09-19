SUMMARY = "DOOM 3 source port"
DESCRIPTION = "dhewm3 is a DOOM 3 GPL source port. \
Unlike the original DOOM 3, dhewm3 uses: \
 \
- SDL for low level OS support, OpenGL and input handling \
- OpenAL for audio output, all OS specific audio backends are gone \
- OpenAL EFX for EAX reverb effects \
- Better support for widescreen (and arbitrary display resolutions)"
LICENSE = "GPL-3.0-only"

PV = "1.5.5"

RPM_NAME = "dhewm3-1.5.5-1.2.aarch64.rpm"
RPM_HASH = "baa0ec53bb714aa000345cead56c3774738bd447e794a5bec022d8fe30ef31784635561e7e0a4188c8ef7ffe1554eea58ac1046a6b60792c2b272a4c93c3de5c"

RPROVIDES:${PN} += "bundled-miniz \
dhewm3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL3.so.0 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libm.so.6 \
libopenal.so.1 \
libstdc++.so.6"

inherit rpm
