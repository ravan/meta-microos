SUMMARY = "KDAB State Machine Editor core library"
DESCRIPTION = "The KDAB State Machine Editor Library is a framework that can be used \
to help develop State Machine Editing graphical user \
interfaces and tools. Output from such applications is in metacode \
or QML that can then be used in Qt or QtQuick projects."
LICENSE = "LGPL-2.1-only"

PV = "2.3.1"

RPM_NAME = "libkdstatemachineeditor_core-qt6-2-2.3.1-1.7.aarch64.rpm"
RPM_HASH = "2c23aec4edc864dd3b6346bbb8d74fffcdca912139509d47abb567fef74ec1758876dcf2bfda4a5f81f1713bc7279625b50f037ab681063158b6ccd56bc8348e"

RPROVIDES:${PN} += "libkdstatemachineeditor-core-qt6-2 \
libkdstatemachineeditor-core-qt6.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libcgraph.so.8 \
libgcc-s.so.1 \
libgvc.so.7 \
libgvplugin-dot-layout.so.8 \
libstdc++.so.6"

inherit rpm
