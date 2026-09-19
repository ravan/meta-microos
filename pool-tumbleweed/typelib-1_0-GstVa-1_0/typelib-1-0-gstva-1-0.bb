SUMMARY = "Introspection bindings for GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "typelib-1_0-GstVa-1_0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "569b5484cdd8e45cf89c58ce76c885d170d480c004cdddfc594ea655a2867399c18717cdc6f888fe1584a02fa66858cebbf8cecd4dc6342cc098e4768f8b6183"

RPROVIDES:${PN} += "typelib-1-0-GstVa-1-0 \
typelib-GstVa"

RDEPENDS:${PN} += "libgstva-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstBase \
typelib-GstVideo"

inherit rpm
