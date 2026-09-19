SUMMARY = "Manage Flatpak permissions"
DESCRIPTION = "Flatseal is a graphical utility to review and modify permissions from your Flatpak applications."
LICENSE = "GPL-3.0-or-later"

PV = "2.4.1"

RPM_NAME = "flatseal-2.4.1-2.1.noarch.rpm"
RPM_HASH = "94059ddaf5d69e91c3698429c37a16cb44fb349b1581886b6a4b29a1bf1300b1a23155831838d4e68d3b3deafffc0b50ee4449a42a2b0ebe1b7425b72acf4cc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flatseal"

RDEPENDS:${PN} += "gjs \
typelib-Adw \
typelib-AppStream \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-Gtk \
typelib-WebKit"

inherit rpm
