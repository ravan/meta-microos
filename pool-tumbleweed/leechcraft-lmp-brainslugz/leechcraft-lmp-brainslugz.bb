SUMMARY = "LeechCraft Collection Checker Module"
DESCRIPTION = "This package provides a collection checker plugin for LeechCraft \
to check the completeness of collections."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-lmp-brainslugz-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "37923f7cad49a185b05ce2022b7336fd9d7de96686df445324a146284e175244d4d9abfadb26976fa8e6843316ba148b00e482d8a3d7c8c0375470b180a49392"

RPROVIDES:${PN} += "leechcraft-lmp-brainslugz \
libleechcraft-lmp-brainslugz.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-lmp \
leechcraft-musiczombie \
leechcraft-scrobbler \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6QuickWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-lmp-util-qt6.so.0.6.75 \
libleechcraft-util-qml-qt6.so.0.6.75 \
libleechcraft-util-qt6.so.0.6.75 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-util-threads-qt6.so.0.6.75 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libstdc++.so.6 \
qt6qmlimport-QtQuick.2"

inherit rpm
