SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "libgstcuda-1_0-0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "b88af5fe819075968eba86fce24273dbf186a7fac51f4f6006794535030fba594aa142e410803199b813c9664a47ae5e5d1f4f35c20ee45324ff46f9384636de"

RPROVIDES:${PN} += "libgstcuda-1-0-0 \
libgstcuda-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgstgl-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libstdc++.so.6"

inherit rpm
