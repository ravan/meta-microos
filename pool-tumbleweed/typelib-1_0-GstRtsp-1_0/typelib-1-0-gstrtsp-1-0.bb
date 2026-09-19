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

RPM_NAME = "typelib-1_0-GstRtsp-1_0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "1f63b2bbc66ad12f0dfba7b259f4017e1bac4ef0623128636f5d47b6254fd61e01dfa654c3843088f81dfcb8cba7c100899ab637c82b9110dfdfea035efde42d"

RPROVIDES:${PN} += "typelib-1-0-GstRtsp-1-0 \
typelib-GstRtsp"

RDEPENDS:${PN} += "libgstrtsp-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio \
typelib-Gst \
typelib-GstBase \
typelib-GstSdp"

inherit rpm
