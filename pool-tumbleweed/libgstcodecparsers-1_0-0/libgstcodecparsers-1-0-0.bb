SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "libgstcodecparsers-1_0-0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "a6d28cb8a0adc1d39ad9777179b6a5b1d34ae9512badd3b7f98b038312602c8bed03fc3793d71a7874526151dd69f8cd2db0ec2cc692570fc9b1687a66d21c3a"

RPROVIDES:${PN} += "libgstcodecparsers-1-0-0 \
libgstcodecparsers-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
