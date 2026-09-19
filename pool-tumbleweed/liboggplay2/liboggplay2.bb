SUMMARY = "Library for playing Ogg multimedia"
DESCRIPTION = "OggPlay is a library designed to allow drop-in playback of Xiph.Org media in an \
application. \
 \
This package contains the shared library."
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "liboggplay2-0.3.0-1.6.aarch64.rpm"
RPM_HASH = "2f32d0d185c8d3a2460ee5f2812e104b85f6fee8f0239291488a1662a8e584c8beffb9a5d17fc0ad67922230ff60b14012a5302e5103054e903eaa5058dca033"

RPROVIDES:${PN} += "liboggplay.so.2 \
liboggplay2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfishsound.so.1 \
libkate.so.1 \
libm.so.6 \
liboggz.so.2 \
libtheora.so.1"

inherit rpm
