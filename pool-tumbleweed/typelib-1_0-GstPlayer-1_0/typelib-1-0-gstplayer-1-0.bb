SUMMARY = "Introspection bindings for GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "typelib-1_0-GstPlayer-1_0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "30fa1d8e3dd8db46e5ed44c18485b0b0e54c015860655f638aa00643f85093cc39d7c967b80625ae03b125464d504e888ed36fa3a18691f012184c5f26925bf4"

RPROVIDES:${PN} += "typelib-1-0-GstPlayer-1-0 \
typelib-GstPlayer"

RDEPENDS:${PN} += "libgstplayer-1.0.so.0 \
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
