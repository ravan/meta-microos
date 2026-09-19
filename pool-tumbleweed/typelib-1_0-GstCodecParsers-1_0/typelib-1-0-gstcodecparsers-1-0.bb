SUMMARY = "Introspection bindings for GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "typelib-1_0-GstCodecParsers-1_0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "fd75740cc1294b7868a4966ad71c7da131bf6d96246a281154d86292f3ecef210e88197b2551b886d1c0f6f2c3b08665c3a80423ba3633651b17411847dc7cb8"

RPROVIDES:${PN} += "typelib-1-0-GstCodecParsers-1-0 \
typelib-GstCodecParsers"

RDEPENDS:${PN} += "libgstcodecparsers-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstBase"

inherit rpm
