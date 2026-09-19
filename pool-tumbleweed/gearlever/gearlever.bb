SUMMARY = "Manage AppImages"
DESCRIPTION = "An utility to manage AppImages with ease! Gear lever will organize and manage \
AppImage files for you, generate desktop entries and app metadata, update apps \
in-place or keep multiple versions side-by-side."
LICENSE = "GPL-3.0-or-later"

PV = "4.6.2"

RPM_NAME = "gearlever-4.6.2-1.1.noarch.rpm"
RPM_HASH = "5341560f83c095f978e4268ab0eb51a4836af84af5634b92fce48277619cd834e14b6cfba8b5b661983febe8e962abf545b3cbb817a29e9f2385e551403e1a4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gearlever"

RDEPENDS:${PN} += "/usr/bin/python3 \
7zip \
dwarfs \
flatpak-spawn \
python3-dbus-python \
python3-desktop-entry-lib \
python3-ftputil \
python3-gobject \
python3-pyxdg \
python3-requests \
squashfs \
typelib-Adw \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-Pango"

inherit rpm
