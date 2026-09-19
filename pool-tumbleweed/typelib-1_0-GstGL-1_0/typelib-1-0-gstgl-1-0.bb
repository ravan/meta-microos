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

RPM_NAME = "typelib-1_0-GstGL-1_0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "2caf8b086ada55878af7be925328bcf20d79c3ddea7a4dc50d144d2f8f3a82423015bce9f118ca765bb7d582e0655583c1ca7b0eea707e34d368df3daa611054"

RPROVIDES:${PN} += "typelib-1-0-GstGL-1-0 \
typelib-GstGL"

RDEPENDS:${PN} += "libgstgl-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstBase \
typelib-GstVideo"

inherit rpm
