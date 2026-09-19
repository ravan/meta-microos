SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "libgstbadaudio-1_0-0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "1dd33498c5167c67c20f53c1962817ddbbc25343e167dd95f04336e3e79ce418a9a2e06d6d82462994da7f8cb6e5412f5e02af63be70e2835e5fe92c0fb97609"

RPROVIDES:${PN} += "libgstbadaudio-1-0-0 \
libgstbadaudio-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstaudio-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
