SUMMARY = "Introspection bindings for GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "typelib-1_0-GstHipGL-1_0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "91ab9217e9577bfe1cbbb5eef80c4117e9d98f5e1440a92dbe80e2eb9440d37ecf9a41bbe31032e77f85e046374d03ae9746b7fd79b18ec03c751cb8a023ee1c"

RPROVIDES:${PN} += "typelib-1-0-GstHipGL-1-0 \
typelib-GstHipGL"

RDEPENDS:${PN} += "libgsthip-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstBase \
typelib-GstGL \
typelib-GstHip \
typelib-GstVideo"

inherit rpm
