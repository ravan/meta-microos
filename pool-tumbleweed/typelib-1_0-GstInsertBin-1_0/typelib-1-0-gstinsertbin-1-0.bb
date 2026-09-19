SUMMARY = "Introspection bindings for GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "typelib-1_0-GstInsertBin-1_0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "01de965f78e047708a2923d403ac92a1fbf38aa92f109294ba59eced4825e632e90f9f70e46fe198688dc4ba79a47377ac9a891a6e68bc28b761ea3152843f55"

RPROVIDES:${PN} += "typelib-1-0-GstInsertBin-1-0 \
typelib-GstInsertBin"

RDEPENDS:${PN} += "libgstinsertbin-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst"

inherit rpm
