SUMMARY = "Streaming-Media Framework Runtime"
DESCRIPTION = "GStreamer is a streaming-media framework, based on graphs of filters \
which operate on media data. Applications using this library can do \
anything from real-time sound processing to playing videos, and just \
about anything else media-related.  Its plug-in-based architecture \
means that new data types or processing capabilities can be added by \
installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "gstreamer-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "6d5c0aeda84951a72d4190d0746e97b3ed90ad084e988ad7a42e3df5cd828e0794ab9c9b387497751aab7a8e3dd7cffb3e538349be3905a6ab08ddd6edfc25cf"

RPROVIDES:${PN} += "gstreamer \
gstreamer-doc \
libgstcoreelements.so \
libgstcoretracers.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1-0-0 \
libgstreamer-1.0.so.0 \
permissions"

inherit rpm
