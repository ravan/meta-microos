SUMMARY = "AVIF image loader for GTK+ applications"
DESCRIPTION = "A pixbuf-loader plugin to load AVIF images in GTK+ applications."
LICENSE = "BSD-2-Clause"

PV = "1.4.2"

RPM_NAME = "gdk-pixbuf-loader-libavif-1.4.2-1.4.aarch64.rpm"
RPM_HASH = "6c0f5d3fa562eeb1790c10299cde347877737d0fff9d026d25887737d06a142c8ab420999de18ce137ad4c09b7ab32c9ea0c5dfbda50262f5757dc355a76877e"

RPROVIDES:${PN} += "gdk-pixbuf-loader-libavif \
libpixbufloader-avif.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libavif.so.16 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
