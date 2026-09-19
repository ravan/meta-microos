SUMMARY = "A game programming library"
DESCRIPTION = "Allegro is a cross-platform library mainly aimed at \
video game and multimedia programming. It handles common, low-level \
tasks such as creating windows, accepting user input, loading data, \
drawing images, playing sounds, etc. and generally abstracting away \
the underlying platform. However, Allegro is not a game engine: \
developers are free to design and structure the program as desired."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.11.3"

RPM_NAME = "liballegro_color5_2-5.2.11.3-1.5.aarch64.rpm"
RPM_HASH = "28d0544a7c8ecff0240e0ad3f88ef679320d1f8a120d17978dea9eac0c865d33aa5cb7669dd3ebfddfcc90f55aa779d4c7150cacab228af9970f97242856a6d8"

RPROVIDES:${PN} += "liballegro-color.so.5.2 \
liballegro-color5-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
liballegro.so.5.2 \
libc.so.6 \
libm.so.6"

inherit rpm
