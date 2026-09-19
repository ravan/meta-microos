SUMMARY = "Introspection bindings for GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "typelib-1_0-GstVulkanWayland-1_0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "a5c69b3516ddd8237887e37df756e18bd459f83c97fa254463b250ada8757e15d6abb98e24f59f4aa47bac2b02a8c8222d94822a0e294a11defd7e7bf79f4351"

RPROVIDES:${PN} += "typelib-1-0-GstVulkanWayland-1-0 \
typelib-GstVulkanWayland"

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
