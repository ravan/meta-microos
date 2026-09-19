SUMMARY = "Devhelp plugin for Gedit"
DESCRIPTION = "Devhelp is an API documentation browser for GTK+ and GNOME. \
 \
This package contains the Devhelp plugin for gedit."
LICENSE = "GPL-3.0-or-later"

PV = "43.0"

RPM_NAME = "gedit-plugin-devhelp-43.0-3.7.aarch64.rpm"
RPM_HASH = "ec4e6818c5c932ff257e681db3ba01a5751a498a6df27f0f48852da210fe8853448ef0dbaabe183c2d2879b776949d834bb9ec71d01ebb0de192083939e77a18"

RPROVIDES:${PN} += "gedit-plugin-devhelp"

RDEPENDS:${PN} += "devhelp \
gedit \
typelib-GObject \
typelib-Gedit \
typelib-Gio \
typelib-Gtk"

inherit rpm
