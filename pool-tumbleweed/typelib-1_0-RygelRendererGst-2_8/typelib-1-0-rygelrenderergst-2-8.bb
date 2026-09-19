SUMMARY = "GObject introspection files for the Rygel RendererGst library"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network."
LICENSE = "LGPL-2.0-or-later"

PV = "45.2"

RPM_NAME = "typelib-1_0-RygelRendererGst-2_8-45.2-1.2.aarch64.rpm"
RPM_HASH = "be3c3e0b9b260dff0c340d66a07e8faef445d60cf26ad45eed12d8b85f03af5a322908ab969f4ef8f4a983e335fd4ed7858559e354eca1fe4d9a5ab74679abac"

RPROVIDES:${PN} += "typelib-1-0-RygelRendererGst-2-8 \
typelib-RygelRendererGst"

RDEPENDS:${PN} += "librygel-renderer-gst-2.8.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-GSSDP \
typelib-GUPnP \
typelib-GUPnPAV \
typelib-Gee \
typelib-Gio \
typelib-Gst \
typelib-RygelCore \
typelib-RygelRenderer \
typelib-Soup \
typelib-libxml2"

inherit rpm
