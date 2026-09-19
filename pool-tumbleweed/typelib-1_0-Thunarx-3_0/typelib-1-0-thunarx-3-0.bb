SUMMARY = "Thunar Extension Library -- Introspection bindings"
DESCRIPTION = "This package provides the GObject Introspection bindings for the Thunar extension library libthunarx-3-0."
LICENSE = "GPL-2.0-or-later"

PV = "4.20.10"

RPM_NAME = "typelib-1_0-Thunarx-3_0-4.20.10-1.1.aarch64.rpm"
RPM_HASH = "784449564fb69886c18c75f897289dedd98dee7d3762649daea4b860c0a0eb57eadc1f29e7fd469ced595dc6c86c415faa3bfc6e78dee20e60468a4c5a016fac"

RPROVIDES:${PN} += "typelib-1-0-Thunarx-3-0 \
typelib-Thunarx"

RDEPENDS:${PN} += "libthunarx-3.so.0 \
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
