SUMMARY = "Introspection bindings for GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "typelib-1_0-GstMpegts-1_0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "bba1ff91eb29f1f7f259942dfbeabfc8bfb662a97b00bb93bf3d0051186834cf26f540cd7e9ddfa1b3fcbf405d793074d25e2daca15a22a04ee620b05fd7662d"

RPROVIDES:${PN} += "typelib-1-0-GstMpegts-1-0 \
typelib-GstMpegts"

RDEPENDS:${PN} += "libgstmpegts-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst"

inherit rpm
