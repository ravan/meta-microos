SUMMARY = "Introspection bindings for GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "typelib-1_0-GstWebRTC-1_0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "af4ccc1009d02394470a2606d20e04a480d4ff49005f17f76613ef8b6880dff227e72343a22f6dc01cf9523c6d13b7d2163d7aed1e5003c90fd738a5c5846659"

RPROVIDES:${PN} += "typelib-1-0-GstWebRTC-1-0 \
typelib-GstWebRTC"

RDEPENDS:${PN} += "libgstwebrtc-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstSdp"

inherit rpm
