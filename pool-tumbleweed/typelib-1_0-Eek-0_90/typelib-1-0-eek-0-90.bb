SUMMARY = "Eekboard libraries -- Introspection bindings"
DESCRIPTION = "This package contains the libraries for eekboard"
LICENSE = "GPL-3.0-or-later"

PV = "1.0.8"

RPM_NAME = "typelib-1_0-Eek-0_90-1.0.8-12.9.aarch64.rpm"
RPM_HASH = "20bff883f28387a59f7cf20aa29903c996a12b9f2b32fb7809ea7a0445f3bb51ab07e93fec3a3ee6a1fa87285557132cd067cf9dc0d5d845f745164def632c10"

RPROVIDES:${PN} += "typelib-1-0-Eek-0-90 \
typelib-Eek \
typelib-EekGtk \
typelib-EekXkl \
typelib-Eekboard"

RDEPENDS:${PN} += "eekboard \
libeek-gtk.so.0 \
libeek-xkl.so.0 \
libeek.so.0 \
libeekboard.so.0 \
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
