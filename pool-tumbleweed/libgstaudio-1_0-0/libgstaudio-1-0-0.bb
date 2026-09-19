SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "libgstaudio-1_0-0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "fc2ed464d4e2c0a8b682f3e8e353e0573edeabbff756408b516a1b97734d62f8aa2693d65925ce529e78a02befad36be40254a32bb92f503a1393e7bb9b02443"

RPROVIDES:${PN} += "libgstaudio-1-0-0 \
libgstaudio-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
gstreamer-plugins-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgsttag-1.0.so.0 \
libm.so.6 \
liborc-0.4.so.0"

inherit rpm
