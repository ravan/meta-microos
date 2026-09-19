SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "libgstrtsp-1_0-0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "58ce1ec767cdced62492083d6859bde018c060ae30e6ed54015e2a61dcaa5f66b0783debf8c0b76ebcf487d3fabffcbee460af30beb47779bcee607206896d29"

RPROVIDES:${PN} += "libgstrtsp-1-0-0 \
libgstrtsp-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
gstreamer-plugins-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libm.so.6"

inherit rpm
