SUMMARY = "Introspection bindings for GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "typelib-1_0-GstHip-1_0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "c834b166f25b36e9c4230eb0da9c2af4b629dfa21cf7ef474307271c2b02de6c860d507abd08721d29af6d3c69c069a432c2c73e5b4c1ce1490c1719bac221ae"

RPROVIDES:${PN} += "typelib-1-0-GstHip-1-0 \
typelib-GstHip"

RDEPENDS:${PN} += "libgsthip-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstBase \
typelib-GstVideo"

inherit rpm
