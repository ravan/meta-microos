SUMMARY = "Settings editor for the LightDM GTK+ Greeter"
DESCRIPTION = "A dialog for allowing users to modify the settings of lightdm-gtk-greeter."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.3"

RPM_NAME = "lightdm-gtk-greeter-settings-1.2.3-1.3.noarch.rpm"
RPM_HASH = "2ada949c1b573cb514c14763d93409bc63d06d8ce42805e697023341bf7b6583bd45b7d25e48231e138c9396ee3d7a1b2533285fd99d47d438efe464ed090b7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lightdm-gtk-greeter-settings \
python3.13dist-lightdm-gtk-greeter-settings \
python3dist-lightdm-gtk-greeter-settings"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
lightdm-gtk-greeter \
python-abi \
python3 \
python3-gobject-Gdk \
typelib-GLib \
typelib-GObject \
typelib-Gtk \
typelib-Pango"

inherit rpm
