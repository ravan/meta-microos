SUMMARY = "A collection of extensions for Gnome-shell classic"
DESCRIPTION = "This GNOME Shell extension adds a power off item in the status \
menu, and provides the ability to hibernate. \
 \
This package provides the extensions required to switch to \
gnome-shell classic."
LICENSE = "GPL-2.0-or-later"

PV = "50.3"

RPM_NAME = "gnome-shell-classic-50.3-1.1.noarch.rpm"
RPM_HASH = "c56a8b05712075a599b288f9549ba1fe04fe85a2463eda53bd595c30541dd6df3dbfd6337492ad62f080afb7b207afe56f5ee2c751ddcaf1b5ec71f2a4d55b4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-classic"

RDEPENDS:${PN} += "gnome-shell-extensions-common \
typelib-Adw \
typelib-Atk \
typelib-Clutter \
typelib-GLib \
typelib-GMenu \
typelib-GObject \
typelib-Gio \
typelib-Gtk \
typelib-Mtk \
typelib-Shell \
typelib-St"

inherit rpm
