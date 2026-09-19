SUMMARY = "Desktop icon support for GNOME Shell"
DESCRIPTION = "This package provides a GNOME Shell extension for showing the contents \
of ~/Desktop on the desktop of the Shell. Common file management \
operations such as launching, copy/paste, rename and deleting are \
supported."
LICENSE = "GPL-3.0-or-later"

PV = "20.10.0"

RPM_NAME = "gnome-shell-extension-desktop-icons-20.10.0-1.2.noarch.rpm"
RPM_HASH = "f3bf0c2e54109e2a0250d50b39758bda3a4f5fc34cb781ad98f45142bcf05ae4a680658b0e03e9601a65a347be4aadcf70811b70b75ee83a4e8ea896233d8a31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-extension-desktop-icons"

RDEPENDS:${PN} += "/usr/bin/gjs \
gnome-shell \
nautilus \
typelib-Clutter \
typelib-Cogl \
typelib-GLib \
typelib-GObject \
typelib-GdkPixbuf \
typelib-Gio \
typelib-GnomeDesktop \
typelib-Gtk \
typelib-Meta \
typelib-Pango \
typelib-Shell \
typelib-St \
xdg-desktop-portal-gtk"

inherit rpm
