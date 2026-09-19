SUMMARY = "Firewall configuration application"
DESCRIPTION = "The firewall configuration application provides an configuration interface for \
firewalld."
LICENSE = "GPL-2.0-or-later"

PV = "2.3.2"

RPM_NAME = "firewall-config-2.3.2-2.1.noarch.rpm"
RPM_HASH = "76db506a602c85d234ce4e5e6ca907f200ff9cbe4f18d3d2e05b412515196ed3b0649e4a04e15d835c150c85342d3ee9d35f28dd1f8dd832dd0184981d974a40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firewall-config"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
firewalld \
hicolor-icon-theme \
python3-gobject-Gdk \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gio \
typelib-Gtk \
typelib-Pango"

inherit rpm
