SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins - Wayland backend"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "libgstwayland-1_0-0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "7dd1c411856f02090c40ec9e007658941212d08f0c145886f193e4c3813fef746378d9767f71280ea16018fc872b46cbf7dae72ec3e65ba362bf7e86636c2684"

RPROVIDES:${PN} += "libgstwayland-1-0-0 \
libgstwayland-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstallocators-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libwayland-client.so.0"

inherit rpm
