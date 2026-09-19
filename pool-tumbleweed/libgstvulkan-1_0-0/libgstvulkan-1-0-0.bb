SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "libgstvulkan-1_0-0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "670a883ba3d4c156feedf8f081dbd4c3ebe42bb2bbd28bcd7fc458d30f954831f3326767b4714873f57012b0475fec3797750b1036f8d8cc521f301f96e890cf"

RPROVIDES:${PN} += "libgstvulkan-1-0-0 \
libgstvulkan-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libvulkan.so.1 \
libwayland-client.so.0 \
libxcb.so.1 \
libxkbcommon-x11.so.0 \
libxkbcommon.so.0"

inherit rpm
