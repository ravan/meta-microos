SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin allows Psi+ to provide a different identification. For example a \
user can set Psi+ to tell others that the user is running Miranda on Windows \
instead of Psi+ on Linux."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.2112+0"

RPM_NAME = "psi+-plugins-clientswitcherplugin-1.5.2112+0-1.6.aarch64.rpm"
RPM_HASH = "0e5b7609d39014b7bf1cc799d9e5804dfc9a50fef12e04135a7969427cfa9971a97cdd2f8ae76f99883ab387f01bd016f84f95f40f43f0397a12b582a2ae4a19"

RPROVIDES:${PN} += "libclientswitcherplugin.so \
psi+-plugins-clientswitcherplugin"

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
