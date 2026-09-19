SUMMARY = "An animated GIF recorder"
DESCRIPTION = "A simple tool that allows you to record short animated GIF images from your screen. \
Currently, only X11 window system is supported."
LICENSE = "GPL-3.0-or-later"

PV = "1.5.1"

RPM_NAME = "peek-1.5.1-2.44.aarch64.rpm"
RPM_HASH = "2892331466edffb68e64866aaffaa4bb85f4ed3d8632a78aaf89474c4805c26b3268529a271b11059b3509a2f5194b0bfbb351ca1254bd525011b64d9a2ec8e1"

RPROVIDES:${PN} += "peek"

RDEPENDS:${PN} += "ImageMagick \
ffmpeg \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libkeybinder-3.0.so.0 \
libpango-1.0.so.0"

inherit rpm
