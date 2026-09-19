SUMMARY = "GTK indicator applet for gammastep"
DESCRIPTION = "This package provides a status icon for gammastep that allows the user \
to control color temperature."
LICENSE = "0BSD & GPL-3.0-or-later & MIT"

PV = "2.0.11"

RPM_NAME = "gammastep-indicator-2.0.11-1.6.aarch64.rpm"
RPM_HASH = "2c2d6965c4e9e719ac62d9ca83230eaab49404df95d10c2358fd09db0571cecc142e67d122ef14b3d2d8f13d30d33c93e7c061d19559c0df7e448c3c7aafcbd4"

RPROVIDES:${PN} += "gammastep-indicator"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
gammastep \
python-abi \
python3dist-pygobject \
python3dist-pyxdg \
typelib-AyatanaAppIndicator3 \
typelib-GLib \
typelib-GObject \
typelib-Gtk"

inherit rpm
