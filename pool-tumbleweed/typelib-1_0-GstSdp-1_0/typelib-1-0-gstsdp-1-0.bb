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

RPM_NAME = "typelib-1_0-GstSdp-1_0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "b7fba436d008b0d371352d048378ec061b181c4dd6775e79b6ee0e221612f93db2513dbfb9a6a98cd4445c6a59682e9392a5a9e33362f06dd1fa06626887b00f"

RPROVIDES:${PN} += "typelib-1-0-GstSdp-1-0 \
typelib-GstSdp"

RDEPENDS:${PN} += "libgstsdp-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst"

inherit rpm
