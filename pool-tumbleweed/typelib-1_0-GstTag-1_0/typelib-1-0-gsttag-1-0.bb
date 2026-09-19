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

RPM_NAME = "typelib-1_0-GstTag-1_0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "653e583cf46160da2ffa7625abe4390130b6450c43996ee9083912003d4b4184d8ed0ee60507ee8fbf3abd5235b6965eabee92ac3bd059979cdec40596edcf2f"

RPROVIDES:${PN} += "typelib-1-0-GstTag-1-0 \
typelib-GstTag"

RDEPENDS:${PN} += "libgsttag-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstBase"

inherit rpm
