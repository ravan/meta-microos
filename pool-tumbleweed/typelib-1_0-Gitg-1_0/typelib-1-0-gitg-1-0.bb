SUMMARY = "Git repository viewer -- Library"
DESCRIPTION = "gitg is a GitX clone for GNOME/gtk+. It aims at being a small, fast and \
convenient tool to visualize git history and actions that benefit from a \
graphical presentation."
LICENSE = "GPL-2.0-or-later"

PV = "50"

RPM_NAME = "typelib-1_0-Gitg-1_0-50-1.1.aarch64.rpm"
RPM_HASH = "82fabbdd2adda00085efa5b86555314b346fa16a3e064ea5ea99959af063dde5e5975da51f37cb57a3a41eb9ac8dfe6be88845aebc5914230f0f8428f33f1d6a"

RPROVIDES:${PN} += "typelib-1-0-Gitg-1-0 \
typelib-Gitg"

RDEPENDS:${PN} += "libgitg-1.0.so.0 \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gee \
typelib-Ggit \
typelib-Gio \
typelib-Gtk \
typelib-GtkSource \
typelib-HarfBuzz \
typelib-Pango \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
