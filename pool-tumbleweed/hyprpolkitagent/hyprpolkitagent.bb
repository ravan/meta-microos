SUMMARY = "A Qt/QML-based polkit authentication agent for Hyprland"
DESCRIPTION = "hyprpolkitagent is a polkit authentication daemon. It is required for GUI \
applications to be able to request elevated privileges."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "hyprpolkitagent-0.1.3-1.11.aarch64.rpm"
RPM_HASH = "89a6bc5cf11adb38b5372a007f962d11b9532a2fec4410ef72af74533a136e40150dfb73a0c62bc2dbe2ec87bc348cb279ed3ee4491fd239bcad347c379c4ae5"

RPROVIDES:${PN} += "hyprpolkitagent"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6QuickControls2.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpolkit-qt6-agent-1.so.1 \
libpolkit-qt6-core-1.so.1 \
libstdc++.so.6 \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Layouts"

inherit rpm
