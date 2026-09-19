SUMMARY = "Drop-down terminal for GNOME"
DESCRIPTION = "Guake is a dropdown terminal made for the GNOME desktop environment."
LICENSE = "GPL-2.0-or-later"

PV = "3.10"

RPM_NAME = "guake-3.10-7.5.noarch.rpm"
RPM_HASH = "a67c1f6f050823e2c985e995d4b08b822dec5a9b1a3c9bb4f206faaa78b8fe635d7e35ccfca1078735681b95d94c28d48f7e55efd8a96cf6ebe8dd485b834b20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guake \
python3.13dist-guake \
python3dist-guake"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-cairo \
python3-dbus-python \
python3-gobject-Gdk \
python3-pyaml \
python3-typing \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkX11 \
typelib-Gio \
typelib-Gtk \
typelib-Keybinder \
typelib-Notify \
typelib-Pango \
typelib-Vte \
typelib-Wnck"

inherit rpm
