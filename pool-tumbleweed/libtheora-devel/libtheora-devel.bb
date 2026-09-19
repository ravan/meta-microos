SUMMARY = "Theora video compression codec"
DESCRIPTION = "Theora is a free and open video compression format. It is designed to scale \
well from postage stamp to HD resolution, and is considered particularly \
competitive at low bitrates. \
 \
The package contains the library that can decode and encode Theora streams. \
Theora is also able to playback VP3 streams."
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "libtheora-devel-1.2.0-2.6.aarch64.rpm"
RPM_HASH = "1faef3a8c3e26f001c5496870d7a8f1fb9802325ce48db310cdfa4072167e6df4cf82715f279cd83bf995f8c53272cbb405fc51573cb81d120da2337a00f3e5c"

RPROVIDES:${PN} += "libtheora-devel \
pkgconfig-theora \
pkgconfig-theoradec \
pkgconfig-theoraenc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtheora1 \
libtheoradec2 \
libtheoraenc2 \
pkgconfig-ogg \
pkgconfig-theoradec"

inherit rpm
