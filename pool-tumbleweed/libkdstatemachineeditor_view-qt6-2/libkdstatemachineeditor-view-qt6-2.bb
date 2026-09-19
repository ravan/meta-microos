SUMMARY = "KDAB State Machine Editor view library"
DESCRIPTION = "The KDAB State Machine Editor Library is a framework that can be used \
to help develop State Machine Editing graphical user \
interfaces and tools. Output from such applications is in metacode \
or QML that can then be used in Qt or QtQuick projects."
LICENSE = "LGPL-2.1-only"

PV = "2.3.1"

RPM_NAME = "libkdstatemachineeditor_view-qt6-2-2.3.1-1.7.aarch64.rpm"
RPM_HASH = "e94516805c68f8be5365a7ba83cd98d20c191f6efbbe0a14eb03a727fa663fb57610ced9c6646e9505d4c5f28f5742c4b8267bf1c984b813a2bc7e4d4459c5f9"

RPROVIDES:${PN} += "libkdstatemachineeditor-view-qt6-2 \
libkdstatemachineeditor-view-qt6.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libkdstatemachineeditor-core-qt6.so.2 \
libstdc++.so.6"

inherit rpm
