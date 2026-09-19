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

RPM_NAME = "typelib-1_0-GstAudio-1_0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "a9ec12f8e84749a9d5d013581233e214a2c805b271e3f7f723c301b67c30856b7408f13f1177cc719aea024f613cfa66dd80d3d1b9ade9d9f15315d1500996a0"

RPROVIDES:${PN} += "typelib-1-0-GstAudio-1-0 \
typelib-GstAudio"

RDEPENDS:${PN} += "libgstaudio-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstBase"

inherit rpm
