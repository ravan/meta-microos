SUMMARY = "Firewall panel applet"
DESCRIPTION = "The firewall panel applet provides a status information of firewalld and also \
the firewall settings."
LICENSE = "GPL-2.0-or-later"

PV = "2.3.2"

RPM_NAME = "firewall-applet-2.3.2-2.1.noarch.rpm"
RPM_HASH = "bfb3a6976bc59b656f53093cc2ffb1381ccb8b90a48ca292797c3b2ff50c11117b9b3341e9bad878d7036da96007c7520dad4cc59af790a8346d7caa5041125a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-firewall-applet \
firewall-applet"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
firewall-config \
hicolor-icon-theme \
python3-PyQt6 \
python3-gobject \
typelib-Notify"

inherit rpm
