SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "libgstsdp-1_0-0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "b8fe7784f9283fcce8a06c72dfab609b1cb171e13f332a8271da3db1433a2b6da96a50d0223e05ff5e131788786e3132a2d2a3ae4f146f98e5e50ebac79413d3"

RPROVIDES:${PN} += "libgstsdp-1-0-0 \
libgstsdp-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
gstreamer-plugins-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstrtp-1.0.so.0"

inherit rpm
