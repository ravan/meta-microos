SUMMARY = "A game programming library"
DESCRIPTION = "Allegro is a cross-platform library mainly aimed at \
video game and multimedia programming. It handles common, low-level \
tasks such as creating windows, accepting user input, loading data, \
drawing images, playing sounds, etc. and generally abstracting away \
the underlying platform. However, Allegro is not a game engine: \
developers are free to design and structure the program as desired."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.11.3"

RPM_NAME = "liballegro5_2-5.2.11.3-1.5.aarch64.rpm"
RPM_HASH = "bb50d53989c2727279fddcd420d6f632daa967328014e4b1297298a610c3c86938a88b9f7110307b5d15002940bf45e1aff0f5e28b4d5a48ae9ad0ae8ae6043f"

RPROVIDES:${PN} += "config-liballegro5-2 \
liballegro.so.5.2 \
liballegro5-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGLX.so.0 \
libOpenGL.so.0 \
libX11.so.6 \
libXcursor.so.1 \
libXi.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libc.so.6 \
libm.so.6"

inherit rpm
