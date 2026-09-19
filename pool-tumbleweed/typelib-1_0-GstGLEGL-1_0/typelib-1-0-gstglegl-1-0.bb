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

RPM_NAME = "typelib-1_0-GstGLEGL-1_0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "f766617683ef4ec7b4f77f6530830e7d37f0f1cf7717d5f3d7bf603518918bdc72533c7fb8cd022aaedeba99e3f275edc53a5c315885d59ebadf56b0e5006d5d"

RPROVIDES:${PN} += "typelib-1-0-GstGLEGL-1-0 \
typelib-GstGLEGL"

RDEPENDS:${PN} += "libgstgl-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstBase \
typelib-GstGL \
typelib-GstVideo"

inherit rpm
