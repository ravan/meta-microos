SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin is designed to make it easy to download and install iconsets and \
other resources for Psi+."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.2112+0"

RPM_NAME = "psi+-plugins-contentdownloaderplugin-1.5.2112+0-1.6.aarch64.rpm"
RPM_HASH = "d1f1c86b39258fe595045afa4204a806b1dfe817da16b608a92ee2f711d32a6aba71d20b945ba838a0c0c0164c26866af3ee91d0106f72c63a018c65ebb8a28d"

RPROVIDES:${PN} += "libcontentdownloaderplugin.so \
psi+-plugins-contentdownloaderplugin"

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
