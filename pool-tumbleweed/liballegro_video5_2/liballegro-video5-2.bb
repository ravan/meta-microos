SUMMARY = "A game programming library"
DESCRIPTION = "Allegro is a cross-platform library mainly aimed at \
video game and multimedia programming. It handles common, low-level \
tasks such as creating windows, accepting user input, loading data, \
drawing images, playing sounds, etc. and generally abstracting away \
the underlying platform. However, Allegro is not a game engine: \
developers are free to design and structure the program as desired."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.11.3"

RPM_NAME = "liballegro_video5_2-5.2.11.3-1.5.aarch64.rpm"
RPM_HASH = "e8d2b34d3124294bacf3e49368f26d32331c1db66f7008d83d365ded0f9dc234318db49a4d9953ca19d61b5adaa68c978b741e643ef18f8117a626ccc72ac62b"

RPROVIDES:${PN} += "liballegro-video.so.5.2 \
liballegro-video5-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
liballegro-audio.so.5.2 \
liballegro.so.5.2 \
libc.so.6 \
libogg.so.0 \
libtheoradec.so.2 \
libvorbis.so.0"

inherit rpm
