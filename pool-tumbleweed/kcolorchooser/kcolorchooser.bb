SUMMARY = "Color Chooser"
DESCRIPTION = "This is an color chooser application by KDE."
LICENSE = "MIT"

PV = "26.08.1"

RPM_NAME = "kcolorchooser-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "33bae9c1b10b22115a2cda73ca30ddebe1399a1df513539e433707c443397ae0f6cef2f213eb9296cf21f8ca7de942f83bc5809153610535c668a0ac600f4109"

RPROVIDES:${PN} += "kcolorchooser"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
