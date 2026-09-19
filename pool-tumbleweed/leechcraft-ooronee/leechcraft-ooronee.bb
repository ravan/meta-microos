SUMMARY = "LeechCraft Text and Images Handler Module"
DESCRIPTION = "This package provides a Leechcraft quark handling text and images \
dropped on it. \
 \
The dropped data is then sent to a data filter chosen by the user. \
See more at http://leechcraft.org/concepts-data-filters ."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-ooronee-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "2fb93d58665146d0f1fe696ba3db8886efe9c899f3a38e0b6039f425b2a4c07bfbc33d217fa3038f1cbda39d194276fa22be0a6752ec93d55fbcfe309c8a67d6"

RPROVIDES:${PN} += "leechcraft-ooronee \
libleechcraft-ooronee.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-sb2 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6 \
qt6qmlimport-QtQuick"

inherit rpm
