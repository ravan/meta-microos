SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins. \
 \
This package provides the GObject Introspection bindings for GStreamer \
plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "typelib-1_0-GstVideo-1_0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "ff4783b4f5c2995ad41a7b627b8926ba5d86f3950bbcc50c153de8126bac2f4979551864a7ef456ca16cdf166ef3b8c146a8b3957d7411397730f2e8a6988a94"

RPROVIDES:${PN} += "typelib-1-0-GstVideo-1-0 \
typelib-GstVideo"

RDEPENDS:${PN} += "libgstvideo-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstBase"

inherit rpm
