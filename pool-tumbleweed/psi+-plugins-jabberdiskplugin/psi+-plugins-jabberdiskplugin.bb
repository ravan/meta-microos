SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin adds support for remote jabber disks into Psi+."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.2112+0"

RPM_NAME = "psi+-plugins-jabberdiskplugin-1.5.2112+0-1.6.aarch64.rpm"
RPM_HASH = "69d930fa552cdbcb438600598c08fa8e1fb33206151e5f571553c5c0421a1a4407bcfe63b22f5771877bdd137740971eab495d82306d07f6201c72e60704cd44"

RPROVIDES:${PN} += "libjabberdiskplugin.so \
psi+-plugins-jabberdiskplugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
psi+"

inherit rpm
