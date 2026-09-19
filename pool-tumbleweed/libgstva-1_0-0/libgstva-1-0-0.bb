SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "libgstva-1_0-0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "6ad877077a36afb878b807bccff4b10226285acb91d32aa86ca16dc48397865a0baee5c25c2ded330489ce874df8cb90e1bfdd1e2e8697c4cd8ce65db6a80346"

RPROVIDES:${PN} += "libgstva-1-0-0 \
libgstva-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstallocators-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libva-drm.so.2 \
libva.so.2"

inherit rpm
