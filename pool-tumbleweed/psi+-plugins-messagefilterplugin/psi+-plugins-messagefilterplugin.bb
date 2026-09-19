SUMMARY = "Plugin for Psi"
DESCRIPTION = "A Psi plugin for filtering messages."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.2112+0"

RPM_NAME = "psi+-plugins-messagefilterplugin-1.5.2112+0-1.6.aarch64.rpm"
RPM_HASH = "860d087e726da2418c68bd962c05e1570b806968834d1feec3ce3c325069be382c43398cbcdbe4a6124a48ae9d0fda7facb21910716df3f4b00ebc400c58ded3"

RPROVIDES:${PN} += "libmessagefilterplugin.so \
psi+-plugins-messagefilterplugin"

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
