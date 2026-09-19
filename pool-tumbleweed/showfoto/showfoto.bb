SUMMARY = "DigiKam: Showfoto"
DESCRIPTION = "Additional program to browse and view photos"
LICENSE = "GPL-2.0-or-later"

PV = "9.1.0"

RPM_NAME = "showfoto-9.1.0-1.2.aarch64.rpm"
RPM_HASH = "9824bb9ed19dccbb215fbaebda79f1df3975a56ddd899c8cfc2b4dc6e6467083e9eb022e617c85a9de78ee9cabbb840c52683b56e290979a2c4ce2b948d247c7"

RPROVIDES:${PN} += "showfoto"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6IconWidgets.so.6 \
libKF6XmlGui.so.6 \
libMagick++-7.Q16HDRI.so.5 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libdigikamcore.so.9.1.0 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
