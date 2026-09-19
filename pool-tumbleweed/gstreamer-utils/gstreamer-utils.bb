SUMMARY = "Streaming-Media Framework Runtime"
DESCRIPTION = "GStreamer is a streaming-media framework, based on graphs of filters \
which operate on media data. Applications using this library can do \
anything from real-time sound processing to playing videos, and just \
about anything else media-related.  Its plug-in-based architecture \
means that new data types or processing capabilities can be added by \
installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "gstreamer-utils-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "09f81f05eb1e004a62913ae75a3b52f20037829475c93a086c59ec06ef9ee96f20d743f3ddeda86fe0eb140e1ba896a961866bfd6a336c0deedbbb469031d945"

RPROVIDES:${PN} += "gstreamer-/usr/bin/gst-launch-1.0 \
gstreamer-utils \
gstreamer-utils-versioned"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
