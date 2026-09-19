SUMMARY = "GObject introspection files for the Rygel server library"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network."
LICENSE = "LGPL-2.0-or-later"

PV = "45.2"

RPM_NAME = "typelib-1_0-RygelServer-2_8-45.2-1.2.aarch64.rpm"
RPM_HASH = "a0d931a54f0b29801c663dea008d0ac9a18a9cab76feea0f6c7d5850f2eead3476541c8e5492aa74b1acb10a02a3309b227b68df412256d963e6b868bc7969fd"

RPROVIDES:${PN} += "typelib-1-0-RygelServer-2-8 \
typelib-RygelServer"

RDEPENDS:${PN} += "librygel-server-2.8.so.0 \
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
