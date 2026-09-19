SUMMARY = "A game programming library"
DESCRIPTION = "Allegro is a cross-platform library mainly aimed at \
video game and multimedia programming. It handles common, low-level \
tasks such as creating windows, accepting user input, loading data, \
drawing images, playing sounds, etc. and generally abstracting away \
the underlying platform. However, Allegro is not a game engine: \
developers are free to design and structure the program as desired."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.11.3"

RPM_NAME = "liballegro_primitives5_2-5.2.11.3-1.5.aarch64.rpm"
RPM_HASH = "8695520b31d43a7c02cfbe879e13e0426940e2ab463838b9e75dd3f6cd7e4f4e73ef70f99f4a191296a09583731bc525211d038c67599faa7b8e237297e00af7"

RPROVIDES:${PN} += "liballegro-primitives.so.5.2 \
liballegro-primitives5-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
liballegro.so.5.2 \
libc.so.6 \
libm.so.6"

inherit rpm
