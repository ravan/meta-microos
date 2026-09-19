SUMMARY = "Introspection bindins for libgladeui"
DESCRIPTION = "Glade is a RAD tool to develop user interfaces for the Gtk+ 3 toolkit \
and the GNOME desktop environment. \
 \
This package provides the GObject Introspection bindings for the \
libgladeui library."
LICENSE = "GPL-2.0-or-later"

PV = "3.40.0"

RPM_NAME = "typelib-1_0-Gladeui-2_0-3.40.0-4.11.aarch64.rpm"
RPM_HASH = "12a1a493f77291ff7da71d04ee901e0545a3228c835c95cbd54a4e76f79bcc2157df2aac0a7223423052cc6e09abce23bbb0fcb74575c7e0ed3f2cc4e3bdb319"

RPROVIDES:${PN} += "typelib-1-0-Gladeui-2-0 \
typelib-Gladeui"

RDEPENDS:${PN} += "libgladeui-2.so.13 \
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
