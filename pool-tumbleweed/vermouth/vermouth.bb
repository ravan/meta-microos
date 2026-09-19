SUMMARY = "A Wine/Proton game launcher for KDE"
DESCRIPTION = "Vermouth is a lightweight game and application launcher for \
running Windows executables through Proton or Wine on KDE. \
It works like Lutris, Heroic, Faugus or Bottles, but is KDE first \
(written in Qt/QML and using Kirigami)."
LICENSE = "MIT"

PV = "2.2.1"

RPM_NAME = "vermouth-2.2.1-1.1.aarch64.rpm"
RPM_HASH = "fbfbdadacde6d2fec0b8eaf2531ceb7e627bd3c4ce778fd5c4d0292492910ba74076a44861bb378e64e50d3f9f999b788b1c97bd0c3b427b26fa7d041ae8e83a"

RPROVIDES:${PN} += "vermouth"

RDEPENDS:${PN} += "kf6-qqc2-desktop-style \
ld-linux-aarch64.so.1 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickControls2.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
