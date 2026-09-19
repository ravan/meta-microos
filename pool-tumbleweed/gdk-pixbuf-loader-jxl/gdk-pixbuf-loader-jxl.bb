SUMMARY = "A gdk-pixbuf loader for JPEG-XL using libjxl"
DESCRIPTION = "This package provides a libjxl-based gdk-pixbuf loader for JPEG XL files."
LICENSE = "BSD-3-Clause"

PV = "0.11.2"

RPM_NAME = "gdk-pixbuf-loader-jxl-0.11.2-2.3.aarch64.rpm"
RPM_HASH = "e060b79588aa5d5e9d371ae0a60f6a4c6ddcaf9f3f46eed502793b6710151604d0f7192eeec5dc429785bfc6949f1a02d8f0294f4424e724a7c93b30faf9f68a"

RPROVIDES:${PN} += "gdk-pixbuf-loader-jxl \
libpixbufloader-jxl.so"

RDEPENDS:${PN} += "/usr/bin/sh \
gdk-pixbuf-query-loaders \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjxl-threads.so.0.11 \
libjxl.so.0.11"

inherit rpm
