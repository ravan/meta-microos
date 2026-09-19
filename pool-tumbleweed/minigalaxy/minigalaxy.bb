SUMMARY = "A GOG client for Linux that lets you download and play your GOG Linux games"
DESCRIPTION = "A GOG client for Linux that lets you download and play your GOG Linux games."
LICENSE = "GPL-3.0-only"

PV = "1.4.2"

RPM_NAME = "minigalaxy-1.4.2-1.1.noarch.rpm"
RPM_HASH = "9143ac44dd8cc614bdde1cee107e5a14004b06797d6dd584b3ba2f7def188e8e0583cb9f398cdba57cfef993a37c50633fc7d1ad2e0d022ee7967197d56d8e63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "minigalaxy \
python3.13dist-minigalaxy \
python3dist-minigalaxy"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-gobject \
python3-gobject-Gdk \
python3-requests \
typelib-GLib \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-Notify \
typelib-WebKit2"

inherit rpm
