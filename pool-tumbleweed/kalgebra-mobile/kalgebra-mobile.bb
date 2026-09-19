SUMMARY = "Math Expression Solver and Plotter - mobile version"
DESCRIPTION = "KAlgebra is a math expression solver and plotter. This package includes \
a QtQuick based version for use in mobile (phone, tablet) environments."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kalgebra-mobile-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "a51fd12f782fa71c04fb9d23e8ace3a66046c1c37c7f4f4769fb2f18f8213644c5af95fe9555fe1e22c54a8bd1c81ceda11b52c0a146dd7de56306c46ef30036"

RPROVIDES:${PN} += "kalgebra-mobile"

RDEPENDS:${PN} += "kf6-kirigami-imports \
ld-linux-aarch64.so.1 \
libAnalitza.so.9 \
libAnalitzaGui.so.9 \
libAnalitzaPlot.so.9 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6-declarative-imports"

inherit rpm
