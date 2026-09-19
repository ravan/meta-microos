SUMMARY = "Python library for creating mock D-Bus objects"
DESCRIPTION = "With this program/Python library, one can create mock objects on D-Bus. \
This is useful for writing tests for software which talks to D-Bus services \
such as upower, systemd, logind, gnome-session or others, and it is hard \
(or impossible without root privileges) to set the state of the real services \
to what one may expect in tests."
LICENSE = "LGPL-3.0-or-later"

PV = "0.34.2"

RPM_NAME = "python314-python-dbusmock-0.34.2-1.7.noarch.rpm"
RPM_HASH = "7de0ffb385fc1c15c107e46fb8272aeded8ffd6654dc40bfb75dd1544cd6911d4f360a722899be8c93b4a7a83246ea9e8095a497ad27406c212755d907eda3e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-dbusmock \
python314-dbusmock \
python314-python-dbusmock \
python3dist-python-dbusmock"

RDEPENDS:${PN} += "/usr/bin/dbus-daemon \
python-abi \
python314-dbus-python \
python314-gobject \
typelib-GLib"

inherit rpm
