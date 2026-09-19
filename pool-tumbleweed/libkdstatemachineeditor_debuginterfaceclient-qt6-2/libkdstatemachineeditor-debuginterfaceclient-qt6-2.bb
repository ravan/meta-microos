SUMMARY = "KDAB State Machine Editor core library"
DESCRIPTION = "The KDAB State Machine Editor Library is a framework that can be used \
to help develop State Machine Editing graphical user \
interfaces and tools. Output from such applications is in metacode \
or QML that can then be used in Qt or QtQuick projects."
LICENSE = "LGPL-2.1-only"

PV = "2.3.1"

RPM_NAME = "libkdstatemachineeditor_debuginterfaceclient-qt6-2-2.3.1-1.7.aarch64.rpm"
RPM_HASH = "489e6f2b344b8c00306f984f97ad58bd6042df81dd4c3165a268534c7cea9565cda0c0efe393887b02eaa49db0e60faada8eadcd800c4214bde4ef17927baee4"

RPROVIDES:${PN} += "libkdstatemachineeditor-debuginterfaceclient-qt6-2 \
libkdstatemachineeditor-debuginterfaceclient-qt6.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6RemoteObjects.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libkdstatemachineeditor-core-qt6.so.2 \
libstdc++.so.6"

inherit rpm
