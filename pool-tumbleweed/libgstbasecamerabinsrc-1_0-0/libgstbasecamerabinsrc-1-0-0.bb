SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "libgstbasecamerabinsrc-1_0-0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "e56f81a74d0539816859d4a1a5f9dab8ee99b4ef0c6eb01b7852f46b703ef870e967a384bf1e4924daaf4a56d4afbe899120730dd5e97fe9ffd49228337a5fdd"

RPROVIDES:${PN} += "libgstbasecamerabinsrc-1-0-0 \
libgstbasecamerabinsrc-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstapp-1.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
