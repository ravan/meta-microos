SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "libgstdxva-1_0-0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "23dd4a0a5e50f1616b7bf7899e1f8e70eda10466f05bd37271036038c6af5b6f7fd56d13aecca48741455d16125ab5f4ce31642bd006d91ab1097cf40147759d"

RPROVIDES:${PN} += "libgstdxva-1-0-0 \
libgstdxva-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstcodecs-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libstdc++.so.6"

inherit rpm
