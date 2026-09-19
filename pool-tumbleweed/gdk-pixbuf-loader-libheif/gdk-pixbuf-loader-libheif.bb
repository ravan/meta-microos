SUMMARY = "GDK PixBuf Loader for libheif"
DESCRIPTION = "A ISO/IEC 23008-12:2017 HEIF file format decoder and encoder. \
 \
This package contains the GDK PixBuf Loader for libheif."
LICENSE = "LGPL-3.0-only & MIT"

PV = "1.23.4"

RPM_NAME = "gdk-pixbuf-loader-libheif-1.23.4-1.1.aarch64.rpm"
RPM_HASH = "c336cc1dd61c21b23bdc23f745808ee3b39fb091d822b5d86f384cfac948d6d0435c69c36da57d8684690ed74573e497386353d37c1c16f65f07fcea90c9240f"

RPROVIDES:${PN} += "gdk-pixbuf-loader-libheif \
libpixbufloader-heif.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libheif.so.1 \
libheif1"

inherit rpm
