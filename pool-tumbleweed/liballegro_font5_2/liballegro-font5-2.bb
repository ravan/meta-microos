SUMMARY = "A game programming library"
DESCRIPTION = "Allegro is a cross-platform library mainly aimed at \
video game and multimedia programming. It handles common, low-level \
tasks such as creating windows, accepting user input, loading data, \
drawing images, playing sounds, etc. and generally abstracting away \
the underlying platform. However, Allegro is not a game engine: \
developers are free to design and structure the program as desired."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.11.3"

RPM_NAME = "liballegro_font5_2-5.2.11.3-1.5.aarch64.rpm"
RPM_HASH = "8d3ee6a0303a86879186eeb474d91964c2360dc8d7c1ab484953e49dfe98fa83fdccb0137a6ce9458e2ec00b1fd236a17f2b725edfb179ba53dbd471b99f9958"

RPROVIDES:${PN} += "liballegro-font.so.5.2 \
liballegro-font5-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
liballegro.so.5.2 \
libc.so.6"

inherit rpm
