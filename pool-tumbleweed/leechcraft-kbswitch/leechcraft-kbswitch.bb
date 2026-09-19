SUMMARY = "LeechCraft keyboard switcher Module"
DESCRIPTION = "This module allows changing keyboard layouts from LeechCraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-kbswitch-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "3bbb3b6e40f321434aba4050d602c005bcfcc757aa572ff485fbd24db2be7cb5481f2cff3c74164e21f3ae8fd9e042743c53b2747aa2fc24f4e89acb87f0a6b9"

RPROVIDES:${PN} += "leechcraft-kbswitch \
libleechcraft-kbswitch.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Quick.so.6 \
libQt6Widgets.so.6 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-util-x11-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6 \
libxcb-xkb.so.1 \
libxcb.so.1 \
libxkbfile.so.1 \
qt6qmlimport-QtQuick \
setxkbmap"

inherit rpm
