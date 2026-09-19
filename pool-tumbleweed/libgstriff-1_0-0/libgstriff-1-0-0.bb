SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "libgstriff-1_0-0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "c2d099cfb929e28bf74100af471ec3f58d61c8d7ce1bb03d9ba631bd2572f931bade8643d7eddbdda974e4ef99f584fde86c0bb86c7f1e85cfb37610041e3356"

RPROVIDES:${PN} += "libgstriff-1-0-0 \
libgstriff-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
gstreamer-plugins-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstaudio-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgsttag-1.0.so.0"

inherit rpm
