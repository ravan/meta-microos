SUMMARY = "QtQuick components for kirigami-addons"
DESCRIPTION = "A set of 'widgets' i.e visual end user components along with a \
code to support them. Components are usable by both touch and \
desktop experiences providing a native experience on both, and \
look native with any QQC2 style (qqc2-desktop-theme, Material \
or Plasma). This package provides a library to use some \
kirigami-addons features in C++ programs."
LICENSE = "LGPL-3.0-only"

PV = "1.13.0"

RPM_NAME = "libKirigamiAddonsComponents6-1.13.0-1.2.aarch64.rpm"
RPM_HASH = "8541e5fe91b203c4c8b6908f8982d7d046e7c42789efbf7b1e11b830712336d3320ff1da3b502ddc6c7c22a90117d288b44288104a920b0f07c3215ed74340c9"

RPROVIDES:${PN} += "libKirigamiAddonsComponents.so.6 \
libKirigamiAddonsComponents6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6QuickControls2.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
