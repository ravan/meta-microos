SUMMARY = "A game programming library"
DESCRIPTION = "Allegro is a cross-platform library mainly aimed at \
video game and multimedia programming. It handles common, low-level \
tasks such as creating windows, accepting user input, loading data, \
drawing images, playing sounds, etc. and generally abstracting away \
the underlying platform. However, Allegro is not a game engine: \
developers are free to design and structure the program as desired."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.11.3"

RPM_NAME = "liballegro_image5_2-5.2.11.3-1.5.aarch64.rpm"
RPM_HASH = "50137765ae2be21c96fbe6f51541ae7505f0a6b55ebf7d424bdb30e4c46ea0b35b0c8b8e06956b087876456aa39fcab028aff9dd7b51f5db4e4030f887d3e3a8"

RPROVIDES:${PN} += "liballegro-image.so.5.2 \
liballegro-image5-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
liballegro.so.5.2 \
libc.so.6 \
libfreeimage.so.3 \
libjpeg.so.8 \
libpng16.so.16 \
libwebp.so.7"

inherit rpm
