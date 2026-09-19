SUMMARY = "Streaming-Media Framework Runtime -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming-media framework, based on graphs of filters \
which operate on media data. Applications using this library can do \
anything from real-time sound processing to playing videos, and just \
about anything else media-related.  Its plug-in-based architecture \
means that new data types or processing capabilities can be added by \
installing new plug-ins. \
 \
This package provides the GObject Introspection bindings for GStreamer."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "typelib-1_0-Gst-1_0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "e0e9e5c4fed3070b5d57a52fc65368a3b875ba4a95c35ab6ddf1615f572f23024f0e0b8732b1acfd4913c81ca201d2c971eeee78eb163576ca2d4c299808ba91"

RPROVIDES:${PN} += "typelib-1-0-Gst-1-0 \
typelib-Gst \
typelib-GstBase \
typelib-GstCheck \
typelib-GstController \
typelib-GstNet"

RDEPENDS:${PN} += "libgstbase-1.0.so.0 \
libgstcheck-1.0.so.0 \
libgstcontroller-1.0.so.0 \
libgstnet-1.0.so.0 \
libgstreamer-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
