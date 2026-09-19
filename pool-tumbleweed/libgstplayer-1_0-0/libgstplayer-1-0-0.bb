SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "libgstplayer-1_0-0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "c76dc85a87d8d989c136b5d702a72d8cda0e72f110e3af4229ab08b73bf22d93a314292863f6072c78c8e02a86d351983dc3d3a4ed61812010d301567eb02417"

RPROVIDES:${PN} += "libgstplayer-1-0-0 \
libgstplayer-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstplay-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0"

inherit rpm
