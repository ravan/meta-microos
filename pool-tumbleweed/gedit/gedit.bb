SUMMARY = "UTF-8 text editor"
DESCRIPTION = "Gedit is a UTF-8 text editor for the GNOME environment. \
 \
It features a multi-document frame, syntax highlighting, autoindent \
options, autosave, and plugins."
LICENSE = "GPL-2.0-or-later"

PV = "50.0"

RPM_NAME = "gedit-50.0-1.3.aarch64.rpm"
RPM_HASH = "e75213083fdddef3c6a4df21a2676ea2936bae5d9204a0325641e3f7403003801b29a4c9bb134798d6e50f4891b2e5bc8e5d8ca7a3f120ac1767ec03d08fb3ed"

RPROVIDES:${PN} += "gedit \
gedit2 \
libcodecomment.so \
libdocinfo.so \
libfilebrowser.so \
libgedit-50.so \
libmodelines.so \
libquickhighlight.so \
libsort.so \
libspell.so \
libtextsize.so \
libtime.so \
typelib-Gedit"

RDEPENDS:${PN} += "gsettings-desktop-schemas \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgedit-amtk-5.so.0 \
libgedit-gfls-1.so.0 \
libgedit-gtksourceview-300.so.5 \
libgedit-tepl-6.so.4 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgspell-1.so.3 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libpeas-1.0.so.1 \
libpeas-gtk-1.0.so.1 \
typelib-Amtk \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-GtkSource \
typelib-HarfBuzz \
typelib-Pango \
typelib-Tepl \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
