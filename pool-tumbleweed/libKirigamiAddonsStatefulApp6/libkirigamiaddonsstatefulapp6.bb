SUMMARY = "Stateful application suppport library for kirigami-addons"
DESCRIPTION = "A set of 'widgets' i.e visual end user components along with a \
code to support them. Components are usable by both touch and \
desktop experiences providing a native experience on both, and \
look native with any QQC2 style (qqc2-desktop-theme, Material \
or Plasma). This package provides a library to add standard \
stateful functionality to applications using kirigami-addons."
LICENSE = "LGPL-3.0-only"

PV = "1.13.0"

RPM_NAME = "libKirigamiAddonsStatefulApp6-1.13.0-1.2.aarch64.rpm"
RPM_HASH = "d32d968b1db4eec86b656ad164765c13627432a315cf2b8810beb3861ab5b4b3eb6d781813e228f70ecd813d09d7c66ad1566b5ea8a5377b81f96cd746d8273b"

RPROVIDES:${PN} += "libKirigamiAddonsStatefulApp.so.6 \
libKirigamiAddonsStatefulApp6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
