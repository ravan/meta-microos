SUMMARY = "GStreamer-plugins-base extra plugins"
DESCRIPTION = "This package provides GStreamer-plugins-bad cdparanoia and libvisual support."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "gstreamer-plugins-base-extra-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "4a24e7d28a5a592999065283d29b456640fb0baddfc6042d33fb3d36fa2c6c2e4c86004311839f41f00a30f57b360775ebd4840ef5bfae842bf18d6b83aa90c9"

RPROVIDES:${PN} += "gstreamer-plugins-base-extra \
gstreamer1 \
libgstcdparanoia.so \
libgstlibvisual.so"

RDEPENDS:${PN} += "gstreamer-plugins-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdda-interface.so.0 \
libcdda-paranoia.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstaudio-1.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libvisual-0.4.so.0"

inherit rpm
