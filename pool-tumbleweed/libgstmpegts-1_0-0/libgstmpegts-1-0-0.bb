SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "libgstmpegts-1_0-0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "a2f7cfd4d0b6dec1904997e74a2371cc4ec7ca54dbe10a89b3595241a4a3c29a97abc746d70f1cb75fffbd8044e3f4dcd2e3c34e0f6cbb0797f57c1a731edff1"

RPROVIDES:${PN} += "libgstmpegts-1-0-0 \
libgstmpegts-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
