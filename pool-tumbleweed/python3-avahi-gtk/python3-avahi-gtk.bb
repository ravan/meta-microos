SUMMARY = "A set of Avahi utilities written in Python Using python-gtk"
DESCRIPTION = "Avahi is an implementation of the DNS Service Discovery and Multicast \
DNS specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "python3-avahi-gtk-0.8-45.2.aarch64.rpm"
RPM_HASH = "77e01d7a8b615fe846a9a003e7db95b3e9bf28cec4fdb3b87f982659cfdde7d61f993df3b989671ae52080722ed7d124d7e551c45c94a2d723d9e3fcdedab82a"

RPROVIDES:${PN} += "python-avahi-/usr/bin/avahi-discover \
python-avahi-gtk \
python3-avahi-gtk"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
coreutils \
python3-avahi \
python3-gobject \
typelib-GObject \
typelib-Gtk"

inherit rpm
