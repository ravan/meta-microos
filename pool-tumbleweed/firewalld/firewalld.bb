SUMMARY = "A firewall daemon with D-Bus interface providing a dynamic firewall"
DESCRIPTION = "firewalld is a firewall service daemon that provides a dynamic customizable \
firewall with a D-Bus interface."
LICENSE = "GPL-2.0-or-later"

PV = "2.3.2"

RPM_NAME = "firewalld-2.3.2-2.1.noarch.rpm"
RPM_HASH = "595915b739e511ac4be3cb5a88b3bfb8337da49ba68f869b5458d21b6b8b2992ee0b79e757d357fe3996d6642971da2c3b28fb8d4a21780129f343465cf0b924"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-firewalld \
firewalld \
firewalld-prometheus-config"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/python3.13 \
/usr/bin/sh \
/usr/bin/touch \
fillup \
nftables \
python3-firewall \
python3-gobject \
python3-nftables \
typelib-GObject"

inherit rpm
