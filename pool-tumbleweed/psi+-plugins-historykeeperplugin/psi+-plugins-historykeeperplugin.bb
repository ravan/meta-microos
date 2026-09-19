SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin is designed to remove the history of selected contacts when the Psi+ \
is closed."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.2112+0"

RPM_NAME = "psi+-plugins-historykeeperplugin-1.5.2112+0-1.6.aarch64.rpm"
RPM_HASH = "52e3e28cf5ad57ddfb8bc3e64fe6c619486fbb17ff7f02d641f6beaa741e47eaf8f7d52f85bfb396ca1f7ab303e005199ae3b6d336a0a3019c29f44b1ef68d04"

RPROVIDES:${PN} += "libhistorykeeperplugin.so \
psi+-plugins-historykeeperplugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
psi+"

inherit rpm
