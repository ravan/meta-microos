SUMMARY = "Convergent calculator"
DESCRIPTION = "Kalk is a convergent calculator application built with the Kirigami framework. \
Although it is mainly targeted for mobile platforms, it can also be used on the \
desktop."
LICENSE = "GPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "kalk-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "d040675e2ef0a9daa98c7969b55f09b5693896e2d5272bf19ce3d0826be51cccc0b5890761f06dac80d448a6c46588994bcdcff794a493de87bcf64e6c2f15c0"

RPROVIDES:${PN} += "kalk"

RDEPENDS:${PN} += "kf6-kirigami-imports \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6I18nQml.so.6 \
libKF6UnitConversion.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6QuickControls2.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libqalculate.so.23 \
libstdc++.so.6 \
qt6-declarative-imports"

inherit rpm
