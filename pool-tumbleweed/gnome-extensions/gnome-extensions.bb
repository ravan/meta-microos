SUMMARY = "Extensions app for GNOME Shell"
DESCRIPTION = "This package contains an optional extensions app for managing GNOME Shell extensions."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "50.4"

RPM_NAME = "gnome-extensions-50.4-1.1.aarch64.rpm"
RPM_HASH = "012b9132a922bda736740332aa6594b35c4145eeeee05d367e8bc2a6c5e9ea2346afe91ff36ab88a2d9ab9105a370233f54df3ffc0d200217f4fcc2673a0db5b"

RPROVIDES:${PN} += "gnome-extensions"

RDEPENDS:${PN} += "/usr/bin/sh \
gnome-shell \
typelib-Adw \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-Shew"

inherit rpm
