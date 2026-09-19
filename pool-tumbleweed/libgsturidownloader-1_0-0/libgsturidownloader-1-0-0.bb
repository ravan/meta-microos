SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "libgsturidownloader-1_0-0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "8aa218ef8c6d9009f4eccc7dbe3e5f697f0226fe67e85584b24373d429d1a42e7f5a3bffd5adafcb7f1394e720e889626fa4a6eaf47e83e4d40e783cdd156e74"

RPROVIDES:${PN} += "libgsturidownloader-1-0-0 \
libgsturidownloader-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
