SUMMARY = "Open Source Implementation of the GDI+ API"
DESCRIPTION = "Mono library that provide a GDI+ comptible API on non-Windows \
operating systems."
LICENSE = "(LGPL-2.1-or-later | MPL-1.1) & MIT"

PV = "6.2"

RPM_NAME = "libgdiplus0-6.2-1.7.aarch64.rpm"
RPM_HASH = "0e0c86b9653a865bc15138e0bd3463512ec5b413ca0d2c5e00b53e79f8545de7a681f7d07985a8716b46e54beeb03c1fd514202c90540c21c14e1c21e0fd836c"

RPROVIDES:${PN} += "libgdiplus.so.0 \
libgdiplus0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libexif.so.12 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgif.so.7 \
libglib-2.0.so.0 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16 \
libtiff.so.6"

inherit rpm
