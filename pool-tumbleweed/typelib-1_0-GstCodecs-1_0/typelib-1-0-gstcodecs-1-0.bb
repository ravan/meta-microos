SUMMARY = "Introspection bindings for GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "typelib-1_0-GstCodecs-1_0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "38f821819f4e9451becba23b13ab681606f50ce66e4ed0841f20b6ff956d6e8db3a4533a43da9ab6340945f66be10f18a5ab80f6d1032a61262285610f690506"

RPROVIDES:${PN} += "typelib-1-0-GstCodecs-1-0 \
typelib-GstCodecs"

RDEPENDS:${PN} += "libgstcodecs-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstBase \
typelib-GstCodecParsers \
typelib-GstVideo"

inherit rpm
