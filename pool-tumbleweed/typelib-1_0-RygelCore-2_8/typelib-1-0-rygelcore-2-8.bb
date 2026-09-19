SUMMARY = "GObject introspection files for the Rygel core library"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network."
LICENSE = "LGPL-2.0-or-later"

PV = "45.2"

RPM_NAME = "typelib-1_0-RygelCore-2_8-45.2-1.2.aarch64.rpm"
RPM_HASH = "681ad5e7b8fe5bd697e1d6724f68a1d080a8e0be7ac9761f86ce3310049891a0b972fa4b283b114f3b736089986baad219e565e0ca67144353e94eeb6da8c3d8"

RPROVIDES:${PN} += "typelib-1-0-RygelCore-2-8 \
typelib-RygelCore"

RDEPENDS:${PN} += "librygel-core-2.8.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-GSSDP \
typelib-GUPnP \
typelib-Gee \
typelib-Gio \
typelib-Soup \
typelib-libxml2"

inherit rpm
