SUMMARY = "An Audio File Library"
DESCRIPTION = "This audio file library is an implementation of the SGI audio file \
library. At present, not all features of the SGI audio file library are \
implemented. \
 \
This library allows the processing of audio data to and from audio \
files of many common formats (currently AIFF, AIFC, WAVE, and \
NeXT/Sun)."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.3.6"

RPM_NAME = "libaudiofile1-0.3.6-16.5.aarch64.rpm"
RPM_HASH = "dea9b2c863f08ba444f413620d6cb44fe89560cc764124794398100e4ae396b2134d4eabd80f2adeb3fa1bb6db79fadb39a0ed17b5f0d7a2a1259c36ac51c971"

RPROVIDES:${PN} += "libaudiofile.so.1 \
libaudiofile1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFLAC.so.14 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
