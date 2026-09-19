SUMMARY = "Introspection bindings for GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "typelib-1_0-GstBadAudio-1_0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "f8fd19bd5e268dff2ea1f8a673aee7f3c7dd787c7b735266a89ecd32e009908d5c88139deb3877d904e0a183e525e5705a484a35b0445ed71fcd7c9272c21098"

RPROVIDES:${PN} += "typelib-1-0-GstBadAudio-1-0 \
typelib-GstBadAudio"

RDEPENDS:${PN} += "libgstbadaudio-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstAudio \
typelib-GstBase"

inherit rpm
