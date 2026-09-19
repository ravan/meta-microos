SUMMARY = "Nemo extension to enable an embedded terminal"
DESCRIPTION = "Nemo Terminal is an embedded terminal for Nemo, the Cinnamon file \
manager. It embeds a terminal pane into Nemo that is accessible by \
hotkey (default F4) and automatically follows the currently active \
directory in Nemo."
LICENSE = "GPL-3.0-or-later"

PV = "6.4.0"

RPM_NAME = "nemo-extension-terminal-6.4.0-6.4.noarch.rpm"
RPM_HASH = "a284440fccf3fa22369b741a09b4ff58c0114d972e7b8c682a42b267cbdf524ed5c17cf033c5b5ea6274d72337ae7ac927cb262c6a5b20079391d73605e6a056"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nemo-extension-terminal \
nemo-terminal \
python3.13dist-nemo-terminal \
python3dist-nemo-terminal"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.13 \
nemo \
python3-gobject \
python3-gobject-Gdk \
python3-nemo \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gio \
typelib-Gtk \
typelib-Nemo \
typelib-Vte \
typelib-XApp"

inherit rpm
