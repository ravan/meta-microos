SUMMARY = "Introspection bindings for GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "typelib-1_0-GstAnalytics-1_0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "7e2e97f4fbc30324f8bbfa621e12cbac1bd00a76ff9d27429427e3c68c53fac8c8f4315654929247e45824f21563cb8de4746e76b0e5c0e81d0614d2564b0067"

RPROVIDES:${PN} += "typelib-1-0-GstAnalytics-1-0 \
typelib-GstAnalytics"

RDEPENDS:${PN} += "libgstanalytics-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstBase \
typelib-GstVideo"

inherit rpm
