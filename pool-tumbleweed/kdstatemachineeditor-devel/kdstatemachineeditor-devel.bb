SUMMARY = "Introspection/Debugging Tool for Qt Applications"
DESCRIPTION = "The KDAB State Machine Editor Library is a framework that can be used \
to help develop State Machine Editing graphical user \
interfaces and tools. Output from such applications is in metacode \
or QML that can then be used in Qt or QtQuick projects."
LICENSE = "LGPL-2.1-only"

PV = "2.3.1"

RPM_NAME = "kdstatemachineeditor-devel-2.3.1-1.7.aarch64.rpm"
RPM_HASH = "3c51af531dfae015f8a3d5ecb263749fd290cc062a13d28f9a91f5c5088816b6354f7d7d0f3d3f5d202b30de517d43788d58b4b3eb7b7b8655647feb748584b6"

RPROVIDES:${PN} += "cmake-KDSME-qt6 \
kdstatemachineeditor-devel \
kdstatemachineeditor-qt6"

RDEPENDS:${PN} += "libkdstatemachineeditor-core-qt6-2 \
libkdstatemachineeditor-debuginterfaceclient-qt6-2 \
libkdstatemachineeditor-debuginterfacesource-qt6-static \
libkdstatemachineeditor-view-qt6-2"

inherit rpm
