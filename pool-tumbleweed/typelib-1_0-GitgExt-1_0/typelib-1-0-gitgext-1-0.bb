SUMMARY = "Git repository viewer -- Library"
DESCRIPTION = "gitg is a GitX clone for GNOME/gtk+. It aims at being a small, fast and \
convenient tool to visualize git history and actions that benefit from a \
graphical presentation."
LICENSE = "GPL-2.0-or-later"

PV = "50"

RPM_NAME = "typelib-1_0-GitgExt-1_0-50-1.1.aarch64.rpm"
RPM_HASH = "3ad3e59660261b42552f07c2c967838e3b897b3125970f7f05d6a0e73d033437d476d73cc39ce47f7c20ff6929f41648a7f5f207c92e93c54b449f99ecba702b"

RPROVIDES:${PN} += "typelib-1-0-GitgExt-1-0 \
typelib-GitgExt"

RDEPENDS:${PN} += "libgitg-ext-1.0.so.0 \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gee \
typelib-Ggit \
typelib-Gio \
typelib-Gitg \
typelib-Gtk \
typelib-GtkSource \
typelib-HarfBuzz \
typelib-Pango \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
