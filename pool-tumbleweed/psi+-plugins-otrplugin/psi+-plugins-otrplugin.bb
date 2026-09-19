SUMMARY = "Plugin for Psi"
DESCRIPTION = "Off-the-Record (OTR) Messaging allows you to have private conversations over \
instant messaging."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.2112+0"

RPM_NAME = "psi+-plugins-otrplugin-1.5.2112+0-1.6.aarch64.rpm"
RPM_HASH = "ec28be70be9da4e1bf504d376eb301c70e15c6a0ce7114461a5012ff464545cee2573106f8e3fdf2f963e5a9c74e2fe7d105ea29a39fcbad12bc894b48f35877"

RPROVIDES:${PN} += "libotrplugin.so \
psi+-plugins-otrplugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libgcrypt.so.20 \
libotr.so.5 \
libstdc++.so.6 \
libtidy.so.58 \
psi+"

inherit rpm
