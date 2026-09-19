SUMMARY = "GStreamer plugins extra mpeg2 support"
DESCRIPTION = "GStreamer plugins bad extras. Provides mpeg2 encoding support"
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "gstreamer-plugins-bad-extra-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "84010adeaf9c6502048adc621b5dcf66c02378d40ffb8abb95ce8bac1b8b55acfed70802713dc22afa709ff81972c691c449db5fd79e725fc66fc6edb9e88bc9"

RPROVIDES:${PN} += "gstreamer-plugins-bad-extra \
gstreamer1 \
libgstmpeg2enc.so \
libgstmplex.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstaudio-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libmjpegutils-2.2.so.0 \
libmpeg2encpp-2.2.so.0 \
libmplex2-2.2.so.0 \
libstdc++.so.6"

inherit rpm
