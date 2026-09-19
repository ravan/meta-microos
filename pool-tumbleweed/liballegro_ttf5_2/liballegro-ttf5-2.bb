SUMMARY = "A game programming library"
DESCRIPTION = "Allegro is a cross-platform library mainly aimed at \
video game and multimedia programming. It handles common, low-level \
tasks such as creating windows, accepting user input, loading data, \
drawing images, playing sounds, etc. and generally abstracting away \
the underlying platform. However, Allegro is not a game engine: \
developers are free to design and structure the program as desired."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.11.3"

RPM_NAME = "liballegro_ttf5_2-5.2.11.3-1.5.aarch64.rpm"
RPM_HASH = "c801e2606dd9e65edd0a668cdbca33d18300cf1264d6705c036590ab3153b0f2ff78845f66702f68ffdde11f3420a57d0658afa157000fec3312803a18f92418"

RPROVIDES:${PN} += "liballegro-ttf.so.5.2 \
liballegro-ttf5-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
liballegro-font.so.5.2 \
liballegro.so.5.2 \
libc.so.6 \
libfreetype.so.6"

inherit rpm
