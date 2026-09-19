SUMMARY = "Introspection bindings for GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "typelib-1_0-GstVulkanXCB-1_0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "eb3e612521473b6b9a0c9844be8dc42f3239cb1d37aa1a5b6250da00114ec9ef40a6b1418a1e2749a5130e67cbf78c78ad6339a98db4ffcc640b7f042099bd88"

RPROVIDES:${PN} += "typelib-1-0-GstVulkanXCB-1-0 \
typelib-GstVulkanXCB"

RDEPENDS:${PN} += "libgstvulkan-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstBase \
typelib-GstVideo \
typelib-GstVulkan \
typelib-Vulkan"

inherit rpm
