SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "libgstphotography-1_0-0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "f59088454aad508f99bb504790f62d49497a24b54030c6ff4061bb48ca28dffd44f4726265c5009f9aca0b613b65e14849714c13754b95e8cdc6eabe2b575b38"

RPROVIDES:${PN} += "libgstphotography-1-0-0 \
libgstphotography-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
