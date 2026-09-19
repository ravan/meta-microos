SUMMARY = "Typelib"
DESCRIPTION = "Typelib."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.0"

RPM_NAME = "typelib-1_0-Birb-1_0-0.9.0-1.1.aarch64.rpm"
RPM_HASH = "923f410b1cee2429d8795b537567cbba23a3bcda1c90c15074fc01d007b1072152553165198e3e52e4bd5be788a0790c1d9f755105bce5bc87ef0c51d3e786d5"

RPROVIDES:${PN} += "typelib-1-0-Birb-1-0 \
typelib-Birb"

RDEPENDS:${PN} += "libbirb.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio \
typelib-HarfBuzz \
typelib-Pango \
typelib-cairo \
typelib-freetype2"

inherit rpm
