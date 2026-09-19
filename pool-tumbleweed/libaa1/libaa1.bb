SUMMARY = "An ASCII Art Library"
DESCRIPTION = "AA-lib is a low level gfx library. AA-lib does not require a graphics \
device. In fact, there is no graphical output possible. AA-lib replaces \
old-fashioned output methods with a powerful ASCII art renderer."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "libaa1-1.4.0-518.5.aarch64.rpm"
RPM_HASH = "095bd46191cf1489ec68d6d9de86801a2a5448df1764a6e1e3bfdd4654b84a8734ac30d5fb80da098d1c767273cf1eea2c3630209c171f09006880198200f39a"

RPROVIDES:${PN} += "libaa.so.1 \
libaa1 \
libvga.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgpm.so.2 \
libm.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
