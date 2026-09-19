SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "libgstadaptivedemux-1_0-0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "b490ed5aaae035d0186a85980612845c8c3a0f1c7391602bc06651abb8f252c427905ddde2c801be37828f400032dbc278d69d57d7197b7b211ea66e85589fbc"

RPROVIDES:${PN} += "libgstadaptivedemux-1-0-0 \
libgstadaptivedemux-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgsturidownloader-1.0.so.0"

inherit rpm
