SUMMARY = "Visual Front End for XRandR"
DESCRIPTION = "ARandR is designed to provide a simple visual front end for XRandR. Relative \
monitor positions are shown graphically and can be changed in a drag-and-drop \
way."
LICENSE = "GPL-3.0-only"

PV = "0.1.11"

RPM_NAME = "arandr-0.1.11-5.5.noarch.rpm"
RPM_HASH = "af215212e2013ff11f0c8c9b56a99857ed13ec07fe52c6e7ccc40b5a390f2f13abe440644f7d658a76e1d639c5d35357ab29a090970f8d479b69ee7530d0feb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arandr \
python3.13dist-arandr \
python3dist-arandr"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-gobject \
python3-gobject-Gdk \
python3-pycairo \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gtk \
typelib-Pango \
typelib-PangoCairo \
xorg-x11"

inherit rpm
