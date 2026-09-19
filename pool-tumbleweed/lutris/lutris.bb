SUMMARY = "Manager for game installation and execution"
DESCRIPTION = "Lutris allows to gather and manage (install, configure and launch) \
all games acquired from any source, in a single interface. \
This includes, for example, Steam or GOG games, Windows games (WINE), \
or emulated console games and browser games."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.22"

RPM_NAME = "lutris-0.5.22-2.2.aarch64.rpm"
RPM_HASH = "c2cd6d8aa51a631c1f17b7428a80fcdefb2ee999d53d17e898b0be8cfc463b34905fbccfe68bd0123554d47eebc80de271975722ebed6303413c37115e0b31c0"

RPROVIDES:${PN} += "lutris"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
cabextract \
curl \
fluid-soundfont-gm \
libvulkan1-32bit \
p7zip \
psmisc \
python-abi \
python3-Pillow \
python3-PyYAML \
python3-certifi \
python3-dbus-python \
python3-distro \
python3-evdev \
python3-gobject \
python3-gobject-Gdk \
python3-lxml \
python3-protobuf \
python3-requests \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-GnomeDesktop \
typelib-Gtk \
typelib-Pango \
typelib-PangoCairo \
typelib-WebKit2 \
xrandr"

inherit rpm
