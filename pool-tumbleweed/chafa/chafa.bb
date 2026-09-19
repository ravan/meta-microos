SUMMARY = "Image-to-text converter for terminal"
DESCRIPTION = "Chafa is a command-line utility that converts all kinds of images, including \
animated image formats like GIFs, into ANSI/Unicode character output that can \
be displayed in a terminal."
LICENSE = "LGPL-3.0-or-later"

PV = "1.18.2"

RPM_NAME = "chafa-1.18.2-1.3.aarch64.rpm"
RPM_HASH = "62df258bba1684da949b215cb5b86b1e9ae2703f220cb10386c2a6063c06b57f526045d5994ad9632fd01a1420bfb36ea3f6e4539f985eeb8793c9d5a3134316"

RPROVIDES:${PN} += "chafa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libchafa.so.0 \
libchafa0 \
libfreetype.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjpeg.so.8 \
librsvg-2.so.2 \
libtiff.so.6 \
libwebp.so.7 \
libwebpdemux.so.2"

inherit rpm
