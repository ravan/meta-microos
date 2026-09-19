SUMMARY = "Hyprland QT/qml utility apps"
DESCRIPTION = "QT and QML utilities that might be used by various hypr* apps."
LICENSE = "BSD-3-Clause"

PV = "0.1.5"

RPM_NAME = "hyprland-qtutils-0.1.5-2.14.aarch64.rpm"
RPM_HASH = "683c543145c4b0042fea584e08b4283b08c70b9f013de1867e0fa8c78f94aeffd87b2a409ff9ea29fa329a5c9e6ca8ab138f5f71a837aabdd6ed8c3908c17429"

RPROVIDES:${PN} += "hyprland-qtutils"

RDEPENDS:${PN} += "hyprland-qt-support \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6QuickControls2.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libhyprutils.so.13 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
