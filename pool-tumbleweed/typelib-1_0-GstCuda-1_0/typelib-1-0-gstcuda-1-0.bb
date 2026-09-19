SUMMARY = "Introspection bindings for GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "typelib-1_0-GstCuda-1_0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "5bb09730621b62296bcfae59afecc43a6f9870577817731e197bd0b582babb91059eb04992d1f5b9019fc49ab9cccf791db693af0bfa68317ee63c37604b9d5a"

RPROVIDES:${PN} += "typelib-1-0-GstCuda-1-0 \
typelib-GstCuda"

RDEPENDS:${PN} += "libgstcuda-1.0.so.0 \
typelib-CudaGst \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstBase \
typelib-GstGL \
typelib-GstVideo"

inherit rpm
