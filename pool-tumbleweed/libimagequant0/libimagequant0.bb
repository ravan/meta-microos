SUMMARY = "Palette quantization library"
DESCRIPTION = "C library for conversion of RGBA images to 8-bit indexed-color \
(palette) images."
LICENSE = "GPL-3.0-or-later"

PV = "2.18.0"

RPM_NAME = "libimagequant0-2.18.0-1.15.aarch64.rpm"
RPM_HASH = "70cf20cb1411db14ba17c7386980d64ec1e932f2f21fe65c1b8d620aba315d7aa322f58e12444763596af1f47069bfeedfec8f95e12f27bfeed154b372053a44"

RPROVIDES:${PN} += "libimagequant.so.0 \
libimagequant0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgomp.so.1 \
libm.so.6"

inherit rpm
