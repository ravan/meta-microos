SUMMARY = "An IRC Client for GNOME"
DESCRIPTION = "Polari is an IRC client that is designed to integrate seamlessly \
with GNOME 3."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "50.0"

RPM_NAME = "polari-50.0-1.2.aarch64.rpm"
RPM_HASH = "168e59902fd8d4df0d19962ee45a8cfaa54548c02d8d519635e774134b5dc24d28aeac6dc4375888f4757bdcfc04f9e9325c5d54116a20a4515b61e71f9cd649"

RPROVIDES:${PN} += "libpolari-1.0.so \
polari \
typelib-Polari"

RDEPENDS:${PN} += "gjs \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libgirepository-2.0.so.0 \
libgjs.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libtelepathy-glib.so.0 \
libtinysparql-3.0.so.0 \
telepathy-idle \
telepathy-mission-control \
typelib-Adw \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Graphene \
typelib-Gspell \
typelib-Gtk \
typelib-Pango \
typelib-PangoCairo \
typelib-Polari \
typelib-Secret \
typelib-Soup \
typelib-TelepathyGLib \
typelib-Tracker \
typelib-WebKit"

inherit rpm
