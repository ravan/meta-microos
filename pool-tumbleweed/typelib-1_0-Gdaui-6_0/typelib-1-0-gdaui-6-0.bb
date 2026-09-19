SUMMARY = "GNU Data Access (GDA) Library - UI Widgets -- Introspection bindings"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data. \
 \
This package provides the GObject Introspection bindings for \
libgda-ui."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "typelib-1_0-Gdaui-6_0-6.0.0-11.5.aarch64.rpm"
RPM_HASH = "c17e2bc4d0967e77992ba380e63002e0c4d7efb9ee36006af6eaca141adea062cf9e0c2d6f5ea16d12198ffc8e8fdb3f752605ff26abf3301b7c62f03551a194"

RPROVIDES:${PN} += "typelib-1-0-Gdaui-6-0 \
typelib-Gdaui"

RDEPENDS:${PN} += "libgda-ui-6.0.so.6.0.0 \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gda \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Pango \
typelib-cairo \
typelib-freetype2 \
typelib-libxml2 \
typelib-xlib"

inherit rpm
