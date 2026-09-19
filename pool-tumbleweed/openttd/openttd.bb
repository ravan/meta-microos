SUMMARY = "A clone of Chris Sawyer's Transport Tycoon Deluxe"
DESCRIPTION = "OpenTTD is a reimplementation of the Microprose game 'Transport Tycoon Deluxe' with lots of new features and enhancements. To play the game, you need either the original proprietary data set from the game, or install the recommend subpackages OpenGFX, OpenSFX and OpenMSX for an alternate, free set of graphics, sounds and music, respectively. \
 \
Use package openttd-dedicated for systems without SDL."
LICENSE = "GPL-2.0-only"

PV = "15.3"

RPM_NAME = "openttd-15.3-1.3.aarch64.rpm"
RPM_HASH = "064f7d2095b8ff7fa1fb2d703973960f432a8d1cb152578eb84cdf4ed29eea2e49662d8b80679b9980b525d8eaecb90888e6f4f20530181cd64d6523c940a30d"

RPROVIDES:${PN} += "openttd \
openttd-gui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libfluidsynth.so.3 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libicui18n.so.78 \
libicuuc.so.78 \
liblzma.so.5 \
liblzo2.so.2 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libz.so.1 \
openttd-data"

inherit rpm
