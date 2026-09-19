SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "libgstwebrtc-1_0-0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "79b75b00a9119220957b825da25614a9cbf737ab6b925b979c0acd698845f2c75a5ec45dcf60a74f5a0228807c73d6f87c90ff3d7a03854cc68c86b25a113a6d"

RPROVIDES:${PN} += "libgstwebrtc-1-0-0 \
libgstwebrtc-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libgstsdp-1.0.so.0"

inherit rpm
