SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin is designed to work efficiently and comfortably with the Juick \
microblogging service."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.2112+0"

RPM_NAME = "psi+-plugins-juickplugin-1.5.2112+0-1.6.aarch64.rpm"
RPM_HASH = "742adcb287d8c3b30c00af43328972b6603451e25c9648ebf9493c82615afe0aa51112569c453df1785657ef7908e618f807dc16c1126208d8bf8443ddb03ec6"

RPROVIDES:${PN} += "libjuickplugin.so \
psi+-plugins-juickplugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
psi+"

inherit rpm
