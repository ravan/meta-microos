SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "libgstisoff-1_0-0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "6749fe4ad8a3512800377b387a47f79292d1bda076c1c67c53b6139d0fb851f0e609d6c2748bcead56a8acc29dbc6cd711f5daac994d7eba2767acc1c54d6342"

RPROVIDES:${PN} += "libgstisoff-1-0-0 \
libgstisoff-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
