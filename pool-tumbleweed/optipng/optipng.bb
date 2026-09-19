SUMMARY = "A PNG File Compressor"
DESCRIPTION = "OptiPNG is a PNG optimizer that recompresses image files to a smaller \
size, without losing any information. This program also converts \
external formats (BMP, GIF, PNM; TIFF support is coming up) to \
optimized PNG, and performs PNG integrity checks and corrections."
LICENSE = "Zlib"

PV = "7.9.1"

RPM_NAME = "optipng-7.9.1-1.7.aarch64.rpm"
RPM_HASH = "8b30d10dedbbd99de0ad5f3545fd21728e6363585c0a90d045823dc279b6eeb96456e5d84399e951e0537e92d9ba701c5adf5e3c67de7b922acead0dd12ca058"

RPROVIDES:${PN} += "optipng"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpng16.so.16 \
libz.so.1"

inherit rpm
