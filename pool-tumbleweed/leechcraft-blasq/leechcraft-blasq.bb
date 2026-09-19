SUMMARY = "LeechCraft Image storage Module"
DESCRIPTION = "This package provides a modular image storage plugin for LeechCraft \
which supports different cloud image stores like Picasa or Flickr."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-blasq-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "2d823697f0fa2a4e59ef7a4d752bcaf02828f6131e57a755534bd0b2342b84e7a09251d84be8a0f107800c135654226435199f1ac558749834569109355dde3c"

RPROVIDES:${PN} += "leechcraft-blasq \
libleechcraft-blasq.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-blasq-subplugin \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6QuickWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-gui-qt6.so.0.6.75 \
libleechcraft-util-qml-qt6.so.0.6.75 \
libleechcraft-util-qt6.so.0.6.75 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libm.so.6 \
libstdc++.so.6 \
qt6qmlimport-QtQml.Models \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Effects"

inherit rpm
