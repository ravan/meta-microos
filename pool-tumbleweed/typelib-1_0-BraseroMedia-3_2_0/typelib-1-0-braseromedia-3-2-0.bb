SUMMARY = "GObject introspection bindings for libbrasero-media"
DESCRIPTION = "Brasero is an application for the GNOME Desktop to write CD/DVDs. \
 \
This package provides the GObject Introspection bindings for the \
libbrasero-media library."
LICENSE = "GPL-3.0-or-later"

PV = "3.12.3+43"

RPM_NAME = "typelib-1_0-BraseroMedia-3_2_0-3.12.3+43-3.3.aarch64.rpm"
RPM_HASH = "88b98ee6c957795f4415ca8c824d8a7ee1d07865aaa3b6f8e755b829ac5ac1a76672aa82b99f12bb9a8f0094f97ff1bf60a434f57d947a50bfc8965f170d198c"

RPROVIDES:${PN} += "typelib-1-0-BraseroMedia-3-2-0 \
typelib-BraseroMedia"

RDEPENDS:${PN} += "libbrasero-media3.so.1 \
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
