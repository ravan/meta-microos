SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "libgstfft-1_0-0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "5382b70754c3fa60637614dcb24c5b840a35becca95e5d4eeda792c2e4c547975d46ed7678a0720fcdc46d5fd098bf5893d0b5aaa4542f6c3e33d7e22f38b67a"

RPROVIDES:${PN} += "libgstfft-1-0-0 \
libgstfft-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
gstreamer-plugins-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libm.so.6"

inherit rpm
