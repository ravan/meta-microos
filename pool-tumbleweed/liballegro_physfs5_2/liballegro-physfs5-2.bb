SUMMARY = "A game programming library"
DESCRIPTION = "Allegro is a cross-platform library mainly aimed at \
video game and multimedia programming. It handles common, low-level \
tasks such as creating windows, accepting user input, loading data, \
drawing images, playing sounds, etc. and generally abstracting away \
the underlying platform. However, Allegro is not a game engine: \
developers are free to design and structure the program as desired."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.11.3"

RPM_NAME = "liballegro_physfs5_2-5.2.11.3-1.5.aarch64.rpm"
RPM_HASH = "a45ea01b49f778ea2ebbc0275638a7848f4f5087bd92f11f9111f3f9fc063cc42225eb9c73683aa539b5b2df23d9d6f6b7c5f7aab294eee8f0c10399752a2020"

RPROVIDES:${PN} += "liballegro-physfs.so.5.2 \
liballegro-physfs5-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
liballegro.so.5.2 \
libc.so.6 \
libphysfs.so.1"

inherit rpm
