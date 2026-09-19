SUMMARY = "A game programming library"
DESCRIPTION = "Allegro is a cross-platform library mainly aimed at \
video game and multimedia programming. It handles common, low-level \
tasks such as creating windows, accepting user input, loading data, \
drawing images, playing sounds, etc. and generally abstracting away \
the underlying platform. However, Allegro is not a game engine: \
developers are free to design and structure the program as desired."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.11.3"

RPM_NAME = "liballegro_memfile5_2-5.2.11.3-1.5.aarch64.rpm"
RPM_HASH = "daa56b8775dfa0c171598b1b5c85fa4749de6e480006ae48eff201daf1a0c298ce734808ed411e6c4f7d0a2d9677fdb9ca7b92d994f0956fe2c9124806729882"

RPROVIDES:${PN} += "liballegro-memfile.so.5.2 \
liballegro-memfile5-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
liballegro.so.5.2 \
libc.so.6"

inherit rpm
