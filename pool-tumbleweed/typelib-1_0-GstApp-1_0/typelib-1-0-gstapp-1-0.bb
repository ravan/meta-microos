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

RPM_NAME = "typelib-1_0-GstApp-1_0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "0311909a11399e85301392467e4574fe65fd2d590dff179f6f6d27085a641eb358c59e259454522a143bb419e76b6bd7443a34d2f5e41028bb5aaff24bff6ef6"

RPROVIDES:${PN} += "typelib-1-0-GstApp-1-0 \
typelib-GstApp"

RDEPENDS:${PN} += "libgstapp-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstBase"

inherit rpm
