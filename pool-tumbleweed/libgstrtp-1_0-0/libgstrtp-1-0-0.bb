SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "libgstrtp-1_0-0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "7a84f22dcfaacf1ec0f354f0bafccb6f246698b1351516f70264784996140a21c582506b464238ee688fd2727d3433bfbc86242fbb75da38bff3002b5bc9def1"

RPROVIDES:${PN} += "libgstrtp-1-0-0 \
libgstrtp-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
gstreamer-plugins-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
