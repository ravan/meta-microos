SUMMARY = "Application/browser chooser"
DESCRIPTION = "Set Junction as the default application for a resource and let it do the rest. \
Junction will pop up and offer multiple options to handle it."
LICENSE = "GPL-3.0-only"

PV = "1.12"

RPM_NAME = "junction-1.12-1.3.aarch64.rpm"
RPM_HASH = "7d09e0b5782e79f8a3d8c322be7e6e2af511a28a96bc6d0ce7c7b2583c7deb5eee54d1aad674b5a6e856407e92631e87929096db28e69aa89775ad5eb4b7f29f"

RPROVIDES:${PN} += "junction"

RDEPENDS:${PN} += "/usr/bin/gjs \
typelib-Adw \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gio \
typelib-GioUnix \
typelib-Gtk \
typelib-Xdp \
typelib-XdpGtk4"

inherit rpm
