SUMMARY = "Introspection bindings for GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "typelib-1_0-GstVulkan-1_0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "61d1ae11b46451dcdc9fbfd1a5b01059a93759e8fd59aff938a9160b0b21ec44a1e8fb1031e0eeed06bc1d0850eba15db66e18c1f74a5cf215bf683f1eab4f98"

RPROVIDES:${PN} += "typelib-1-0-GstVulkan-1-0 \
typelib-GstVulkan"

RDEPENDS:${PN} += "libgstvulkan-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstBase \
typelib-GstVideo \
typelib-Vulkan"

inherit rpm
