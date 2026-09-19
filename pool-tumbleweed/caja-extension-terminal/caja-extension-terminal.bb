SUMMARY = "Caja extension to enable an embedded terminal"
DESCRIPTION = "Caja Terminal is an embedded terminal for Caja, the MATE file \
manager. It embeds a terminal pane into Caja that is accessible by \
a hotkey (Ctrl+Shift+T) and automatically follows the currently \
active directory in Caja."
LICENSE = "GPL-3.0-or-later"

PV = "0.10"

RPM_NAME = "caja-extension-terminal-0.10-3.15.noarch.rpm"
RPM_HASH = "dd3c6a852552e0c92819a3a650d42f8f0508143886bf388bea84eb92ad0e76c50db67614e7819d9120a08c13d77b3526120e1c1d5ca7378bf0863a32fbd29b98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "caja-extension-terminal"

RDEPENDS:${PN} += "/usr/bin/python3 \
caja \
python-caja \
python3-gobject \
python3-gobject-Gdk \
python3-pyxdg \
typelib-Caja \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gtk \
typelib-Pango \
typelib-Vte"

inherit rpm
