SUMMARY = "GStreamer modules and libraries for videoconferencing"
DESCRIPTION = "Farstream is a collection of GStreamer modules and libraries for \
videoconferencing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.9+5"

RPM_NAME = "libfarstream-0_2-5-0.2.9+5-3.3.aarch64.rpm"
RPM_HASH = "a067cb212b3d23f5f40cccae38ce8cf9477f841dc3ec295472b897157fd98559296f0e17e1664c704cf45472654a61b099f461e62f8be9c8be37a46baa21264e"

RPROVIDES:${PN} += "libfarstream-0-2-5 \
libfarstream-0.2.so.5 \
libmulticast-transmitter.so \
libnice-transmitter.so \
librawudp-transmitter.so \
libshm-transmitter.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
farstream-data \
gstreamer-plugins-farstream \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgstnet-1.0.so.0 \
libgstreamer-1.0.so.0 \
libnice.so.10"

inherit rpm
