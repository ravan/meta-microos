SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "libgstwebrtcnice-1_0-0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "52ddb12b4e2bd9d534eee67e0f07ddf97c3c1c7edd780ae2d11f90cd5890f2aed1f39b164e4e0b2e4600fe2fee14d68daaa106e8b5327e44f6309a361518c50a"

RPROVIDES:${PN} += "libgstwebrtcnice-1-0-0 \
libgstwebrtcnice-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libgstwebrtc-1.0.so.0 \
libnice.so.10"

inherit rpm
