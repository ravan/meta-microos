SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin is designed to block spam messages and other unwanted information \
from Psi+ users."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.2112+0"

RPM_NAME = "psi+-plugins-stopspamplugin-1.5.2112+0-1.6.aarch64.rpm"
RPM_HASH = "9459a2f9bec72da8b7e896f0254ffc066f04d3a0d0212d19ee248e9b4cd8b24c5071b893878c2daf87a398e7ffd465ba910baea63a3366d75b38a4386b031dc5"

RPROVIDES:${PN} += "libstopspamplugin.so \
psi+-plugins-stopspamplugin"

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
