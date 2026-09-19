SUMMARY = "Library for Tracing a Bitmap to Scalable Outline Image"
DESCRIPTION = "Potrace is a utility for tracing a bitmap, which means, transforming a \
bitmap into a smooth, scalable image.  The input is a bitmap (PBM, PGM, \
PPM, or BMP), and the default output is one of several vector file \
formats.  A typical use is to create EPS files from scanned data, such \
as company or university logos, handwritten notes, etc. The resulting \
image is not 'jaggy' like a bitmap, but smooth. It can then be rendered \
at any resolution."
LICENSE = "GPL-2.0-or-later"

PV = "1.16"

RPM_NAME = "libpotrace0-1.16-2.10.aarch64.rpm"
RPM_HASH = "7793d51b10035b015c440a0a226b290cbf7e0912e1b39f7f1f9721205fd99b076b93b172ae62da96ff6c8d1113bf00739e8301f21446caab34cbd7663c3d0c7b"

RPROVIDES:${PN} += "libpotrace.so.0 \
libpotrace0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
