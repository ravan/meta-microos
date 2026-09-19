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

RPM_NAME = "typelib-1_0-GstGLX11-1_0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "a19b2b87f4ed0c15180520f87f6a86a4537084dad74ce0919ddaee18bd7c60b5fda8f8d00635fb264effa23f902b78a892f7cbda7207516bdf274e34f321044e"

RPROVIDES:${PN} += "typelib-1-0-GstGLX11-1-0 \
typelib-GstGLX11"

RDEPENDS:${PN} += "libgstgl-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstBase \
typelib-GstGL \
typelib-GstVideo"

inherit rpm
