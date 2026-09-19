SUMMARY = "A toolsmith for GNOME-based applications"
DESCRIPTION = "Builder is an IDE for GNOME and a tool to help writing GNOME-based \
applications."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-or-later & GPL-3.0-or-later & LGPL-3.0-or-later & LGPL-2.1-or-later"

PV = "50.0"

RPM_NAME = "gnome-builder-50.0-1.2.aarch64.rpm"
RPM_HASH = "a60cefc11ac77e5c4eb2ec3ece7db896d16fa5ea240599b6de4e17a6b78d8274e5f8416809ab5c3821fb5f32bf76af4d8d71d1e70e3bf5db572f569f9fe748d0"

RPROVIDES:${PN} += "gnome-builder \
pkgconfig-gnome-builder-50.0 \
typelib-Ide"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
autoconf \
automake \
ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libclang.so.13 \
libcmark.so.0.31.1 \
libdex-1.so.1 \
libeditorconfig.so.0 \
libflatpak.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libgirepository-2.0.so.0 \
libgit2-glib-1.0.so.0 \
libgit2.so.1.9 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgom-1.0.so.0 \
libgtk-4.so.1 \
libgtksourceview-5.so.0 \
libjson-glib-1.0.so.0 \
libjsonrpc-glib-1.0.so.1 \
libpanel-1.so.1 \
libpango-1.0.so.0 \
libpeas-2.so.0 \
libportal-gtk4.so.1 \
libportal.so.1 \
libsoup-3.0.so.0 \
libspelling-1.so.2 \
libtemplate-glib-1.0.so.0 \
libtool \
libvte-2.91-gtk4.so.0 \
libwebkitgtk-6.0.so.4 \
libxml2.so.16 \
libyaml-0.so.2 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-gtk4 \
pkgconfig-gtksourceview-5 \
pkgconfig-libpeas-2 \
pkgconfig-template-glib-1.0 \
pkgconfig-vte-2.91-gtk4 \
pkgconfig-webkitgtk-6.0 \
python3-gobject-Gdk \
typelib-Adw \
typelib-Dex \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Graphene \
typelib-Gsk \
typelib-Gtk \
typelib-GtkSource \
typelib-HarfBuzz \
typelib-JavaScriptCore \
typelib-Jsonrpc \
typelib-Panel \
typelib-Pango \
typelib-PangoCairo \
typelib-Peas \
typelib-Soup \
typelib-Template \
typelib-Vte \
typelib-WebKit \
typelib-cairo \
typelib-freetype2"

inherit rpm
