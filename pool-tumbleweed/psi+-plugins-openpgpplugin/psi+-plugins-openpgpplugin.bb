SUMMARY = "Plugin for Psi"
DESCRIPTION = "Plugin to support GnuPG end-to-end encryption."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.2112+0"

RPM_NAME = "psi+-plugins-openpgpplugin-1.5.2112+0-1.6.aarch64.rpm"
RPM_HASH = "d76981dbed4f65de8c336a51c880e4930d7772916fcdbe31fe2e64f6a642a5e174dc37845976ddfd00f4cb929dd0d80d8719e397ddad2698dac1fde41c757326"

RPROVIDES:${PN} += "libopenpgpplugin.so \
plugins-gnupgplugin \
psi+-plugins-openpgpplugin"

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
