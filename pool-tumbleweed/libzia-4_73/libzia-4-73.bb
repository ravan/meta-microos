SUMMARY = "Libraries for tucnak"
DESCRIPTION = "Libzia contains architecture-dependent code used by Tucnak and others. \
 \
This package contains the shared library."
LICENSE = "GPL-2.0-or-later"

PV = "4.73"

RPM_NAME = "libzia-4_73-4.73-1.1.aarch64.rpm"
RPM_HASH = "bd60222edde59f306f856ce263ae03b95ccf68cfb57ef7e46e0146cdd044652d10f2636f79f370885ccbe58e12d0ca44be8183b2c021f413c7c1a94587010204"

RPROVIDES:${PN} += "libzia-4-73 \
libzia-4.73.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-ttf-2.0.so.0 \
libc.so.6 \
libftdi1.so.2 \
libglib-2.0.so.0 \
libgnutls.so.30 \
libgtk-3.so.0 \
libpng16.so.16"

inherit rpm
