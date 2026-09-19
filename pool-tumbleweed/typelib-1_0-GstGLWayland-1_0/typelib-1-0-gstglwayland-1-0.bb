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

RPM_NAME = "typelib-1_0-GstGLWayland-1_0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "15cfeacdffa69777539feeadea6fb4fb81cca7007609ff769031f123eea06f22859295a942c3731d63ca21ab9aaef483c2a18056886ac77c9052213f469af9e5"

RPROVIDES:${PN} += "typelib-1-0-GstGLWayland-1-0 \
typelib-GstGLWayland"

RDEPENDS:${PN} += "libgstgl-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstBase \
typelib-GstGL \
typelib-GstVideo"

inherit rpm
