SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin adds the chess game into Psi+."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.2112+0"

RPM_NAME = "psi+-plugins-chessplugin-1.5.2112+0-1.6.aarch64.rpm"
RPM_HASH = "f6c63ccdcdb4873f788349d8075e73540503549c387b9c89c2bb66d75728356fe060b3f3963d7126f7af8d84c9568c296b0b773dd09a3d317211fb2fe0869e05"

RPROVIDES:${PN} += "libchessplugin.so \
psi+-plugins-chessplugin"

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
