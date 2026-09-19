SUMMARY = "A game programming library"
DESCRIPTION = "Allegro is a cross-platform library mainly aimed at \
video game and multimedia programming. It handles common, low-level \
tasks such as creating windows, accepting user input, loading data, \
drawing images, playing sounds, etc. and generally abstracting away \
the underlying platform. However, Allegro is not a game engine: \
developers are free to design and structure the program as desired."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.11.3"

RPM_NAME = "liballegro_audio5_2-5.2.11.3-1.5.aarch64.rpm"
RPM_HASH = "c67fad75da2d89160dabd24f22154941f23b4b339fd6b23adce5b8448d2e2d0885cfcf7d34b3679be3561ecfabce98f7d6d8b635214c5b08b360809cfa2bbf52"

RPROVIDES:${PN} += "liballegro-audio.so.5.2 \
liballegro-audio5-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
liballegro.so.5.2 \
libasound.so.2 \
libc.so.6 \
libm.so.6 \
libopenal.so.1 \
libpulse-simple.so.0 \
libpulse.so.0"

inherit rpm
