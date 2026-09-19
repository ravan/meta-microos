SUMMARY = "GStreamer integration for Clutter"
DESCRIPTION = "Clutter is an open source software library for creating fast, visually \
rich and animated graphical user interfaces. \
 \
Clutter GStreamer enables the use of GStreamer with Clutter."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.27"

RPM_NAME = "libclutter-gst-3_0-0-3.0.27-2.16.aarch64.rpm"
RPM_HASH = "ecb0e447968135ecc893838f13275f7ff0117e93c80eea23c475b438a5fc570f3f485db1179d06d0442f5d219841dfa7e740fabb7b77ccfb0b62e528390d76b9"

RPROVIDES:${PN} += "libclutter-gst-3-0-0 \
libclutter-gst-3.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libclutter-1.0.so.0 \
libcogl.so.20 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstaudio-1.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgsttag-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgudev-1.0.so.0 \
libm.so.6"

inherit rpm
