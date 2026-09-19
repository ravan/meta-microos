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

RPM_NAME = "typelib-1_0-GstPbutils-1_0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "4313d4bd01dd9b07fa56788a9e053cf048a1f31d586232c148c0f7f700bb5637c25f88a6ee244b72ba7eae0bfdbcc4f1ec48f99c1ef4d55db7a41d4675e91887"

RPROVIDES:${PN} += "typelib-1-0-GstPbutils-1-0 \
typelib-GstPbutils"

RDEPENDS:${PN} += "libgstpbutils-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstAudio \
typelib-GstBase \
typelib-GstVideo"

inherit rpm
