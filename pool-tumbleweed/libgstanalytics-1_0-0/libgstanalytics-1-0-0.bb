SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "libgstanalytics-1_0-0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "ddbebdfa0a8ab588753bc51e69baa28e94d8bb1b1dd0ac151af5d2765e6f7100e4332b71ad77fb594dce2d5536d274bcaab900de3f7e9f6207eba757f18cbb6b"

RPROVIDES:${PN} += "libgstanalytics-1-0-0 \
libgstanalytics-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libm.so.6"

inherit rpm
