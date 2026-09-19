SUMMARY = "GObject Introspection Bindings for AMTK"
DESCRIPTION = "“Actions, Menus and Toolbars Kit” or just AMTK is a basic \
GtkUIManager replacement based on GAction, suitable for \
both a traditional UI or a modern UI with a GtkHeaderBar. \
 \
This package provides the GObject Introspection Bindings for AMTK."
LICENSE = "LGPL-3.0-or-later"

PV = "5.10.0"

RPM_NAME = "typelib-1_0-Amtk-5-5.10.0-1.3.aarch64.rpm"
RPM_HASH = "a5892e880a16038001010a83e9473993a94d7068869f12325798ce36f53a796911963194fae92542a1933ea35201b6d447890ecf0f15c0a6564c73f8aef01a11"

RPROVIDES:${PN} += "typelib-1-0-Amtk-5 \
typelib-Amtk"

RDEPENDS:${PN} += "libgedit-amtk-5.so.0 \
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
