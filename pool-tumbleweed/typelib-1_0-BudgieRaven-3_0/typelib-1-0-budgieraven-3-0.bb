SUMMARY = "Raven Introspection bindings for the Budgie Desktop"
DESCRIPTION = "This package provides GObject Introspection files required for \
developing Budgie Raven plugins using interpreted languages, such as Python \
GObject Introspection bindings."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.10.0+13"

RPM_NAME = "typelib-1_0-BudgieRaven-3_0-10.10.0+13-1.2.aarch64.rpm"
RPM_HASH = "5a9374bc9547084b481d4823e8273a48e345cfd2ae9b5781649677d0ba7eda6e2496ade168c971027c6b110cd42cf5a6ca343edbd9563e6bbfb05f82dddd5c97"

RPROVIDES:${PN} += "typelib-1-0-BudgieRaven-3-0 \
typelib-BudgieRaven"

RDEPENDS:${PN} += "libbudgie-raven-plugin.so.0 \
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
typelib-Peas \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
