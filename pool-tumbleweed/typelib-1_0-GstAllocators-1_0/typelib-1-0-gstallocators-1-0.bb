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

RPM_NAME = "typelib-1_0-GstAllocators-1_0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "33c3374fd162029737649fb62c3a7b6ab009924e7c1168592571b51dddc5d9cecd9911aaff7af811de4810222f87f0766a4bff9665a547f14a2db8b974cf35cd"

RPROVIDES:${PN} += "typelib-1-0-GstAllocators-1-0 \
typelib-GstAllocators"

RDEPENDS:${PN} += "libgstallocators-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst"

inherit rpm
