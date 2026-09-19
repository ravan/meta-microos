SUMMARY = "Introspection bindings for the GStreamer-based RTSP server library"
DESCRIPTION = "Introspection bindings for the GStreamer library for building an RTSP server."
LICENSE = "LGPL-2.0-or-later"

PV = "1.28.6"

RPM_NAME = "typelib-1_0-GstRtspServer-1_0-1.28.6-1.1.aarch64.rpm"
RPM_HASH = "c6754b4c71562920ec1e0ab2c7929119e812ca8b1228053060bd0bfd448633436d6bc547bc4226435d7ce24fcba1bf36fcf109791759ebba1321402492cb8d1c"

RPROVIDES:${PN} += "typelib-1-0-GstRtspServer-1-0 \
typelib-GstRtspServer"

RDEPENDS:${PN} += "libgstrtspserver-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio \
typelib-Gst \
typelib-GstBase \
typelib-GstNet \
typelib-GstRtsp \
typelib-GstSdp"

inherit rpm
