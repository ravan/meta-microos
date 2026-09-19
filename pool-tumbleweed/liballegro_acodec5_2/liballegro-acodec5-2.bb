SUMMARY = "A game programming library"
DESCRIPTION = "Allegro is a cross-platform library mainly aimed at \
video game and multimedia programming. It handles common, low-level \
tasks such as creating windows, accepting user input, loading data, \
drawing images, playing sounds, etc. and generally abstracting away \
the underlying platform. However, Allegro is not a game engine: \
developers are free to design and structure the program as desired."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.11.3"

RPM_NAME = "liballegro_acodec5_2-5.2.11.3-1.5.aarch64.rpm"
RPM_HASH = "77d3dd8f490761ee26f386f6bc90c3beab7c7809dd8a94044ff694ca1ee41dd44adde7ed763739db419d0e9fb13fa41655d1287146a13fbcd5bca0e3f0a58839"

RPROVIDES:${PN} += "liballegro-acodec.so.5.2 \
liballegro-acodec5-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFLAC.so.14 \
liballegro-audio.so.5.2 \
liballegro.so.5.2 \
libc.so.6 \
libdumb.so.2 \
libopusfile.so.0 \
libvorbisfile.so.3"

inherit rpm
