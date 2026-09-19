SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin shows popup notifications when users from your roster changes \
their mood, tune or activity."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.2112+0"

RPM_NAME = "psi+-plugins-pepchangenotifyplugin-1.5.2112+0-1.6.aarch64.rpm"
RPM_HASH = "0278c94956326176854d3647ad7d94d6fd06d7bd74c984a6d77b0bab0920dc81daea53abd81bfb913fd1dff6cd21bc2bd69ec0bb23c40f1c7f4c32bae44c5e71"

RPROVIDES:${PN} += "libpepchangenotifyplugin.so \
psi+-plugins-pepchangenotifyplugin"

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
