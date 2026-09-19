SUMMARY = "Library for rendering XPS documents"
DESCRIPTION = "libgxps is a GObject based library for handling and rendering XPS \
documents."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.2+5"

RPM_NAME = "libgxps2-0.3.2+5-1.13.aarch64.rpm"
RPM_HASH = "e927f2b8974cc2ca448a717b3d89d82e7cf670163770d862dd983f05dfd4ecded6a9518dabe7c0ff1b71feca15026ea002ca7c6a3cc9481607a15e5c82c9081b"

RPROVIDES:${PN} += "libgxps.so.2 \
libgxps2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libcairo.so.2 \
libfreetype.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjpeg.so.8 \
liblcms2.so.2 \
libm.so.6 \
libpng16.so.16 \
libtiff.so.6"

inherit rpm
