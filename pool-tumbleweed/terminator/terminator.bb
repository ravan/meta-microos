SUMMARY = "Store and run multiple GNOME terminals in one window"
DESCRIPTION = "Multiple GNOME terminals in one window.  This is a project to produce \
an efficient way of filling a large area of screen space with \
terminals. This is done by splitting the window into a resizeable \
grid of terminals. As such, you can  produce a very flexible \
arrangements of terminals for different tasks."
LICENSE = "GPL-2.0-only"

PV = "2.1.6"

RPM_NAME = "terminator-2.1.6-1.1.noarch.rpm"
RPM_HASH = "bf2a03b67848f88cd7abdeb7626c1b35c08719de771e5c4d082b25c5cb60c073fb5956672b90cac41bdac13c28bb6a21271a3bea3991be6163e0888ab5622e56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-terminator \
python3dist-terminator \
terminator"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
gsettings-desktop-schemas \
hicolor-icon-theme \
python-abi \
python3-cairo \
python3-configobj \
python3-dbus-python \
python3-gobject \
python3-gobject-Gdk \
python3-psutil \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-GdkX11 \
typelib-Gio \
typelib-Gtk \
typelib-Handy \
typelib-Keybinder \
typelib-Notify \
typelib-Pango \
typelib-Vte \
typelib-cairo"

inherit rpm
