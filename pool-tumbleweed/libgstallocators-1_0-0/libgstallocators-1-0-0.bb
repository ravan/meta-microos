SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "libgstallocators-1_0-0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "f2f4736cf338d4c874d9257f0886e482c8ed2e8b4e412c6fe5c8660cc534831c5145875e4dadcd9901f347c652ca8b11dbb8cc2eb8189b7edfbf11e3f7736a70"

RPROVIDES:${PN} += "libgstallocators-1-0-0 \
libgstallocators-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
gstreamer-plugins-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
