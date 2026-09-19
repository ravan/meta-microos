SUMMARY = "A Quake Engine"
DESCRIPTION = "QuakeSpasm is a Quake 1 engine based on the SDL2 port of FitzQuake.  It includes \
64-bit CPU support, a new sound driver, several networking fixes and a few \
graphical niceities, while also staying true to the original game. \
Game data must be placed in ~/.quakespasm/id1 ."
LICENSE = "GPL-2.0-or-later"

PV = "0.96.3"

RPM_NAME = "quakespasm-0.96.3-2.6.aarch64.rpm"
RPM_HASH = "9a0ec873be26891370d007c1b6d95ded3d8a0983075229c08b2cd7ee6252711dba29c0c6816fc28beb7f8bf21d01a58917496772e1dfceb97d17795ed19d431a"

RPROVIDES:${PN} += "quakespasm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libm.so.6 \
libvorbisfile.so.3"

inherit rpm
