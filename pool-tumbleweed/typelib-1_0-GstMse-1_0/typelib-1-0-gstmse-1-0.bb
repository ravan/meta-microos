SUMMARY = "Introspection bindings for GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "typelib-1_0-GstMse-1_0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "7c6fbf2d3d7f2feaa0f038b0eb3c7689e050f2c2fc4e7c5b58f00e1f7362fffd1953313b5387c500a12cbfd0f6fe552d8dd684c9975e77e0cc185253fe06ef9a"

RPROVIDES:${PN} += "typelib-1-0-GstMse-1-0 \
typelib-GstMse"

RDEPENDS:${PN} += "libgstmse-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst"

inherit rpm
