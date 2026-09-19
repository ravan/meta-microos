SUMMARY = "DOOM source port with Hexen support and demo compatibility"
DESCRIPTION = "DSDA-Doom is a source port derived from the PrBoom history line. \
It features: \
 \
* Extra tooling for demo recording, with focus on speedrunning: \
  record-rewind support \
* Heretic and Hexen support \
* MBFv21, UMAPINFO and DSDHacked specification support"
LICENSE = "GPL-2.0-or-later"

PV = "0.29.4"

RPM_NAME = "dsda-doom-0.29.4-1.5.aarch64.rpm"
RPM_HASH = "2666652e7fa17f71026d9f98b85d9faab8e58ea099d9153562daed0a80577928966a232e0f3a282f17b33eeb1824f4fb16f0a8b0e7f5392d832abc5be2cf929b"

RPROVIDES:${PN} += "dsda-doom \
prboom"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libc.so.6 \
libfluidsynth.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libmad.so.0 \
libmvec.so.1 \
libportmidi.so.2 \
libsndfile.so.1 \
libstdc++.so.6 \
libvorbisfile.so.3 \
libxmp.so.4 \
libz.so.1 \
libzip.so.5"

inherit rpm
