SUMMARY = "Typelib files for libpanel"
DESCRIPTION = "Package contains typelib files for use with libpanel."
LICENSE = "LGPL-3.0-or-later"

PV = "1.10.4"

RPM_NAME = "typelib-1_0-Panel-1-1.10.4-2.3.aarch64.rpm"
RPM_HASH = "4945b17f846cf1f19fd83ca409c53dc0eb10677b18819fec5c17937e61cb6a2abc3ca7076435b50b7c08dbaaf231ab8a030d75f1e22376e55470955c357250a0"

RPROVIDES:${PN} += "typelib-1-0-Panel-1 \
typelib-Panel"

RDEPENDS:${PN} += "libpanel-1.so.1 \
typelib-Adw \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Graphene \
typelib-Gsk \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Pango \
typelib-PangoCairo \
typelib-cairo \
typelib-freetype2"

inherit rpm
