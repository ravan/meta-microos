SUMMARY = "Pastebin extension for Nemo file manager"
DESCRIPTION = "nemo-pastebin is an extension for the Nemo file manager, which \
allows users to send files to pastebins just a right-click away."
LICENSE = "GPL-2.0-or-later"

PV = "6.4.0"

RPM_NAME = "nemo-extension-pastebin-6.4.0-6.4.noarch.rpm"
RPM_HASH = "80b2789f409d1413c39cfc890ba0aaed401381d90a3c22efbe7daea43275d061c5e151764c73e1e3eb435ac6903e99f66b8ab3994306323598e9c2a06d0fab1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nemo-extension-pastebin \
nemo-pastebin \
python3.13dist-nemo-pastebin \
python3dist-nemo-pastebin"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.13 \
nemo \
python3-gobject \
python3-gobject-Gdk \
python3-pyxdg \
typelib-GObject \
typelib-Gdk \
typelib-Gio \
typelib-Gtk \
typelib-Nemo \
typelib-Notify"

inherit rpm
