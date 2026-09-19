SUMMARY = "Utility for Tracing a Bitmap to Scalable Outline Image"
DESCRIPTION = "Potrace is a utility for tracing a bitmap, which means, transforming a \
bitmap into a smooth, scalable image.  The input is a bitmap (PBM, PGM, \
PPM, or BMP), and the default output is one of several vector file \
formats.  A typical use is to create EPS files from scanned data, such \
as company or university logos, handwritten notes, etc. The resulting \
image is not 'jaggy' like a bitmap, but smooth. It can then be rendered \
at any resolution."
LICENSE = "GPL-2.0-or-later"

PV = "1.16"

RPM_NAME = "potrace-1.16-2.10.aarch64.rpm"
RPM_HASH = "564c7d4c03d8b5a04d6db2ce9c75d7ffa1a8bfd26559ff938dc72e6785d02e46d0bafcb3f531cd43ad13096a92838117bfa1651edfed188f6b77a187aa4df807"

RPROVIDES:${PN} += "bitmap-tracing \
potrace"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libpotrace.so.0 \
libz.so.1"

inherit rpm
