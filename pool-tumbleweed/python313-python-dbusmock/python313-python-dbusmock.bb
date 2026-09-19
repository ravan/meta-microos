SUMMARY = "Python library for creating mock D-Bus objects"
DESCRIPTION = "With this program/Python library, one can create mock objects on D-Bus. \
This is useful for writing tests for software which talks to D-Bus services \
such as upower, systemd, logind, gnome-session or others, and it is hard \
(or impossible without root privileges) to set the state of the real services \
to what one may expect in tests."
LICENSE = "LGPL-3.0-or-later"

PV = "0.34.2"

RPM_NAME = "python313-python-dbusmock-0.34.2-1.7.noarch.rpm"
RPM_HASH = "f1b2cf2e01f1bf971f2ae3af01ed7832acaad0bfd383d44e497036e94567249038423fd3a477f6c2d50bb6ba0dd90755f415da3e5e62ffafb58bb268fe57fe18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dbusmock \
python3-python-dbusmock \
python3.13dist-python-dbusmock \
python313-dbusmock \
python313-python-dbusmock \
python3dist-python-dbusmock"

RDEPENDS:${PN} += "/usr/bin/dbus-daemon \
python-abi \
python313-dbus-python \
python313-gobject \
typelib-GLib"

inherit rpm
