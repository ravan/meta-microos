SUMMARY = "Share files across the LAN"
DESCRIPTION = "Warpinator is a simple app that allows users to share files across the LAN."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.4"

RPM_NAME = "warpinator-2.0.4-1.2.noarch.rpm"
RPM_HASH = "b9d2034812538c62daef5564a8949ea966bfb74748d8471c32acfa262b6010324af30d2ef9403e40aa72f72920173619512c30c2eb44d456e878f11a8864b556"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "warpinator"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.13 \
/usr/bin/sh \
python3-PyNaCl \
python3-cryptography \
python3-gobject-Gdk \
python3-grpcio \
python3-netifaces \
python3-protobuf \
python3-qrcode \
python3-setproctitle \
python3-xapp \
python3-zeroconf \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-GdkX11 \
typelib-Gio \
typelib-Gtk \
typelib-XApp"

inherit rpm
