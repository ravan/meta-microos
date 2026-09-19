SUMMARY = "Typelib files for gxml"
DESCRIPTION = "Typelib files for gxml."
LICENSE = "LGPL-2.1-or-later"

PV = "0.20.4"

RPM_NAME = "typelib-1_0-GXml-0_20-0.20.4-2.7.aarch64.rpm"
RPM_HASH = "e17d88c02cd44eba5b3c72dcb8025feb21ed7b6e39800b235caa7ba0d61d20788596790ff1527744a8be8ce7688f7403f0d6d51608237497725ccf97d68f110c"

RPROVIDES:${PN} += "typelib-1-0-GXml-0-20 \
typelib-GXml"

RDEPENDS:${PN} += "libgxml-0.20.so.2.0.2 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gee \
typelib-Gio \
typelib-libxml2"

inherit rpm
