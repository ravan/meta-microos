SUMMARY = "GObject introspection files for the Rygel renderer library"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network."
LICENSE = "LGPL-2.0-or-later"

PV = "45.2"

RPM_NAME = "typelib-1_0-RygelRenderer-2_8-45.2-1.2.aarch64.rpm"
RPM_HASH = "7580c8ccf95ebf2118b1ed933e35d52c18a2ffdb89b16303e223877d002e5761b67236673cb60256dfdf7a4ef4fa3342ed1cad9e19ff7d0e0fa702995c0a2e61"

RPROVIDES:${PN} += "typelib-1-0-RygelRenderer-2-8 \
typelib-RygelRenderer"

RDEPENDS:${PN} += "librygel-renderer-2.8.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-GSSDP \
typelib-GUPnP \
typelib-GUPnPAV \
typelib-Gee \
typelib-Gio \
typelib-RygelCore \
typelib-Soup \
typelib-libxml2"

inherit rpm
