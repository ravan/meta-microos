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

RPM_NAME = "typelib-1_0-GstRtp-1_0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "c51289a5821c9dc49092fdcf37f630a037d6dfb35d15839c9d52bfcc4e724a9813da0439af54d22b2054eee5526d9a44cef4cf4cffde3486d2228b3591c61d25"

RPROVIDES:${PN} += "typelib-1-0-GstRtp-1-0 \
typelib-GstRtp"

RDEPENDS:${PN} += "libgstrtp-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstBase"

inherit rpm
