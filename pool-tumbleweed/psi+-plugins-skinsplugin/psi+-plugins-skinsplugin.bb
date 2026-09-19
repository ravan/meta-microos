SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin is designed to create, store and apply skins to Psi."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.2112+0"

RPM_NAME = "psi+-plugins-skinsplugin-1.5.2112+0-1.6.aarch64.rpm"
RPM_HASH = "f11d9bd283367204ddd5ca4781191d7a26fdd156be3f5dee694e1e2991fcc1a2ab28e15a35d6791d17b28505de1b758e4451b41a4e9b4880c94a403e5a65bd95"

RPROVIDES:${PN} += "libskinsplugin.so \
psi+-plugins-skinsplugin"

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
