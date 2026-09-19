SUMMARY = "Automatic archives creating and extracting library -- Introspection bindings"
DESCRIPTION = "gnome-autoar provides functions, widgets, and gschemas for GNOME applications which want \
to use archives as a method to transfer directories over the Internet."
LICENSE = "LGPL-2.0-or-later"

PV = "0.4.5"

RPM_NAME = "typelib-1_0-GnomeAutoar-0_1-0.4.5-3.4.aarch64.rpm"
RPM_HASH = "3bee3bed22b66400d69608ed051632386b12c66bab8d5464e474935223e0ea63d3bd390d8c5d37488698c7fb1d0e0bebc33fa9e0b4ef936ab8817a9e49201e75"

RPROVIDES:${PN} += "typelib-1-0-GnomeAutoar-0-1 \
typelib-GnomeAutoar"

RDEPENDS:${PN} += "libgnome-autoar-0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
