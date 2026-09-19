SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin is designed to send images to roster contacts."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.2112+0"

RPM_NAME = "psi+-plugins-imageplugin-1.5.2112+0-1.6.aarch64.rpm"
RPM_HASH = "dde2865a90b814876b0c8eb3b22ece43ace44236164eb863c3aa98cac8b48d0cedfab95ab8bafc99e14030f720f3ad4ba48ff746659ca68faadca612caca932f"

RPROVIDES:${PN} += "libimageplugin.so \
psi+-plugins-imageplugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
psi+"

inherit rpm
