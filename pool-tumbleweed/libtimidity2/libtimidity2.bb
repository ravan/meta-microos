SUMMARY = "MIDI to WAVE converter library"
DESCRIPTION = "This library is based on the TiMidity decoder from SDL_sound library. \
Purpose to create this library is to avoid unnecessary dependences. \
SDL_sound requires SDL and some other libraries, that not needed to \
process MIDI files. In addition libtimidity provides more suitable \
API to work with MIDI songs, it enables to specify full path to the \
timidity configuration file, and have function to retrieve meta data \
from MIDI song."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.7"

RPM_NAME = "libtimidity2-0.2.7-1.14.aarch64.rpm"
RPM_HASH = "a12ee5566fec3f0c00903cb95371d0b42bde06531db88fee934d1fb101d5689a846ebcf46082509dcd3a270c1f48776554fcfd3ac37f73d076f391232f072ebb"

RPROVIDES:${PN} += "libtimidity.so.2 \
libtimidity2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
