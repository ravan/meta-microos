SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "libgstapp-1_0-0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "af04f8b48c235799eb088af97818b52e91798e44baf1ffcd5d23f13820fba1fb1004238c2adef0ff0d28eaede042264ee7dad4f75f9c52907d5d1040544d1367"

RPROVIDES:${PN} += "libgstapp-1-0-0 \
libgstapp-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
gstreamer-plugins-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
