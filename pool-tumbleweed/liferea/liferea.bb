SUMMARY = "Linux Feed Reader"
DESCRIPTION = "Liferea is an abbreviation for Linux Feed Reader. It is a news \
aggregator for online news feeds. It supports a number of different \
feed formats including RSS/RDF, CDF, Atom, OCS, and OPML. There are \
many other news readers available, but these others are not available \
for Linux or require many extra libraries to be installed. Liferea \
tries to fill this gap by creating a fast, easy-to-use, easy-to-install \
news aggregator for GTK and GNOME."
LICENSE = "GPL-2.0-only"

PV = "2.0.1"

RPM_NAME = "liferea-2.0.1-1.1.aarch64.rpm"
RPM_HASH = "57fc95e672cf951e8b3b426e0be7fdcda4f4485055819e8ac94c57bbf28f74c959f4899255ec96c8024d784efa712f77be030143a3f3d1d3762fcfbbeb6ddd2e"

RPROVIDES:${PN} += "liferea \
typelib-Liferea"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libdbus-1.so.3 \
libfribidi.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libgirepository-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libjson-glib-1.0.so.0 \
libpeas-2.so.0 \
libsoup-3.0.so.0 \
libsqlite3.so.0 \
libwebkitgtk-6.0.so.4 \
libxml2.so.16 \
libxslt.so.1 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Graphene \
typelib-Gsk \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Json \
typelib-Liferea \
typelib-Notify \
typelib-Pango \
typelib-PangoCairo \
typelib-Secret \
typelib-cairo \
typelib-freetype2 \
typelib-libxml2"

inherit rpm
