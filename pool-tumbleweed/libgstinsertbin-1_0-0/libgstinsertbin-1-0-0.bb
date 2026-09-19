SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "libgstinsertbin-1_0-0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "60e73b5a6037af68ede9b5c18b07a6565cc5bcc3d51f4799a8e7d89331978d0bf29b78631891713973bdf278df0d58f4aec47869808610b356d94a9733578898"

RPROVIDES:${PN} += "libgstinsertbin-1-0-0 \
libgstinsertbin-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
