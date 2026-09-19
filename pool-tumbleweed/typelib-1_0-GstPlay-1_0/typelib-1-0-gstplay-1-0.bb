SUMMARY = "Introspection bindings for GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "typelib-1_0-GstPlay-1_0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "b6d1be5e9d58210e0ffce8aeda79497168c2ae187ce69b3a1bfdaf2b301b689550a966aa9a5f6f89997c9f0dd1a3ad0fc6a9de3d588d665647131b46d2757eb1"

RPROVIDES:${PN} += "typelib-1-0-GstPlay-1-0 \
typelib-GstPlay"

RDEPENDS:${PN} += "libgstplay-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstAudio \
typelib-GstBase \
typelib-GstPbutils \
typelib-GstTag \
typelib-GstVideo"

inherit rpm
