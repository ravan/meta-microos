SUMMARY = "Streaming-Media Framework Runtime"
DESCRIPTION = "GStreamer is a streaming-media framework, based on graphs of filters \
which operate on media data. Applications using this library can do \
anything from real-time sound processing to playing videos, and just \
about anything else media-related.  Its plug-in-based architecture \
means that new data types or processing capabilities can be added by \
installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "libgstreamer-1_0-0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "176255535fdd72c2edcea53bdedeae4b7ed58fd354c7fad81a51696925952b1886d92cc1c04215385b4b405bf81b09e8a41b999fcabeb3f33fb3275888ce1899"

RPROVIDES:${PN} += "libgstbase-1.0.so.0 \
libgstcheck-1.0.so.0 \
libgstcontroller-1.0.so.0 \
libgstnet-1.0.so.0 \
libgstreamer-1-0-0 \
libgstreamer-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
gstreamer \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdw.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libunwind.so.8"

inherit rpm
