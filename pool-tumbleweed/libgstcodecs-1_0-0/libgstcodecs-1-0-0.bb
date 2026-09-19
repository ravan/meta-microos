SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "libgstcodecs-1_0-0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "a7ce7d47e6b64920e2ea3dde3ad365564c10c0e3c8992977a3b1aa2608ea75c55ff81085482ad34284be823eda8de9f08c121b03c3563ba46d7a29daaed487e9"

RPROVIDES:${PN} += "libgstcodecs-1-0-0 \
libgstcodecs-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstbase-1.0.so.0 \
libgstcodecparsers-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0"

inherit rpm
