SUMMARY = "The 'Intelligent Input Bus' input method"
DESCRIPTION = "IBus, short for Intelligent Input Bus, is an input framework. IBus \
plugins then provide the particular logic how to translate keypresses \
to input characters and possibly show disambiguation windows around \
the text cursor."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.34"

RPM_NAME = "ibus-1.5.34-2.1.aarch64.rpm"
RPM_HASH = "7a821c6bb94b640050cd9a62d38d2d742f5873f43a9e4e2081b86310789b5ac7d54a30e633064ac8ba2faedad58096f518f33a35c5aae7e0bbeafddead91322a"

RPROVIDES:${PN} += "config-ibus \
ibus \
locale-ja;ko;zh \
rpm-macro--ibus-autostartdir \
rpm-macro--ibus-componentdir \
rpm-macro--ibus-datadir \
rpm-macro--ibus-enginedir \
rpm-macro--ibus-icondir \
rpm-macro--ibus-includedir \
rpm-macro--ibus-keymapdir \
rpm-macro--ibus-libdir \
rpm-macro--ibus-libexecdir \
rpm-macro--ibus-setupdir \
rpm-macro--ibus-tabledir \
rpm-macro-ibus-requires \
rpm-macro-ibus-table-index-post \
rpm-macro-ibus-table-requires"

RDEPENDS:${PN} += "/usr/bin/sh \
dconf \
ibus-dict-emoji \
iso-codes \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXfixes.so.3 \
libXi.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libdbusmenu-glib.so.4 \
libdbusmenu-gtk3.so.4 \
libdconf.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libibus-1-0-5 \
libibus-1.0.so.5 \
libnotify.so.4 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libwayland-client.so.0 \
libxkbcommon.so.0 \
python-abi \
python3-dbus-python \
python3-gobject \
python3-gobject-Gdk \
typelib-1-0-Gtk-3-0 \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-GdkX11 \
typelib-Gio \
typelib-Gtk \
typelib-IBus \
typelib-Pango"

inherit rpm
