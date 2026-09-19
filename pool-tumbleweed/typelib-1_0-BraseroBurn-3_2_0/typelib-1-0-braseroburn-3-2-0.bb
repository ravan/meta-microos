SUMMARY = "Introspection bindings for libbrasero-burn"
DESCRIPTION = "Brasero is an application for the GNOME Desktop to write CD/DVDs. \
 \
This package provides the GObject Introspection bindings for the \
libbrasero-burn library."
LICENSE = "GPL-3.0-or-later"

PV = "3.12.3+43"

RPM_NAME = "typelib-1_0-BraseroBurn-3_2_0-3.12.3+43-3.3.aarch64.rpm"
RPM_HASH = "cc24c49d4b0cdeab78a1797af71ec196a498d3f63646a31b70529b77b540e1e82dfbd7b2defa71a712d7a7afbf40bc44eabbc6cb83c4cc1254ea695dd7ecfaab"

RPROVIDES:${PN} += "typelib-1-0-BraseroBurn-3-2-0 \
typelib-BraseroBurn"

RDEPENDS:${PN} += "libbrasero-burn3.so.1 \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Pango \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
