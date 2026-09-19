SUMMARY = "Introspection bindings for GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "typelib-1_0-GstDxva-1_0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "d1a1c9585d70d73eee65431756042a7536bdf7f6c227296f17b6cc17a240c5968fc4f029b3ad05186db37438048ba17fc998316a598cb82b9ead26b5af4af2a7"

RPROVIDES:${PN} += "typelib-1-0-GstDxva-1-0 \
typelib-GstDxva"

RDEPENDS:${PN} += "libgstdxva-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstBase \
typelib-GstCodecParsers \
typelib-GstCodecs \
typelib-GstVideo"

inherit rpm
