SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "libgsttag-1_0-0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "0eb33fb10f0c1ef6dc96b344c6eafa434f9d8e923cf01cda1de02c5f39d97ae058be124e63b1b3debb2579c220804f32aa2a37fca72435ae38e8b58eea77c37e"

RPROVIDES:${PN} += "libgsttag-1-0-0 \
libgsttag-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
gstreamer-plugins-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0 \
libm.so.6 \
libz.so.1"

inherit rpm
