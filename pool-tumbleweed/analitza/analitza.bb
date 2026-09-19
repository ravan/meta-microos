SUMMARY = "A library to add mathematical features to programs"
DESCRIPTION = "The Analitza library lets developers add mathematical features to programs."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "analitza-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "9922b328ae0b892a11918c59f2ad864e6ddcc47178c85f39575dd61fecc2a9db76567c54c392d5c112e90fa43cb817d1b55b6aea3e9e9c3f4578fb45b16e0c5d"

RPROVIDES:${PN} += "analitza \
analitza5 \
libanalitzadeclarativeplugin.so \
qt6qmlimport-org.kde.analitza \
qt6qmlimport-org.kde.analitza.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libAnalitza.so.9 \
libAnalitza9 \
libAnalitzaGui.so.9 \
libAnalitzaPlot.so.9 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpenGL.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.2 \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-org.kde.analitza.1"

inherit rpm
