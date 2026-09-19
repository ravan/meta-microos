SUMMARY = "Settings Manager for Compiz (CCSM)"
DESCRIPTION = "Compiz Config and Settings tool (CCSM)."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "compizconfig-settings-manager-0.8.18-3.3.noarch.rpm"
RPM_HASH = "0c44d349874c77ddb22100cd9fd009b7c05fc8d3b1f2204c65417c71e928f3f04bc57890464088531aa7b258d3ca079ad39ee17b2ac41460a38eb387f5d46196"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ccsm \
compizconfig-settings-manager"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python3-ccm \
typelib-GLib \
typelib-Gdk \
typelib-Gio \
typelib-Gtk \
typelib-Pango \
typelib-PangoCairo"

inherit rpm
