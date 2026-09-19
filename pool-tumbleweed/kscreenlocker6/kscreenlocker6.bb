SUMMARY = "Library and components for secure lock screen architecture"
DESCRIPTION = "Library and components for secure lock screen architecture."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "kscreenlocker6-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "2a48303b72eff3d8e145186e880ea356529e64efe24379a1158cc919be52f50687db7224d0afea28dda706c22c5ee6d68d227baa8c3a8bb088edf90324f89706"

RPROVIDES:${PN} += "kscreenlocker \
kscreenlocker6 \
qt6qmlimport-org.kde.kscreenlocker \
qt6qmlimport-org.kde.kscreenlocker.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigQml.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6GlobalAccel.so.6 \
libKF6I18n.so.6 \
libKF6I18nQml.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6KCMUtilsQuick.so.6 \
libKF6KIOCore.so.6 \
libKF6Package.so.6 \
libKF6ScreenDpms.so.8 \
libKF6WindowSystem.so.6 \
libKF6XmlGui.so.6 \
libLayerShellQtInterface.so.6 \
libPlasma.so.7 \
libPlasmaQuick.so.7 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libX11.so.6 \
libc.so.6 \
libpam.so.0 \
libstdc++.so.6 \
libwayland-client.so.0 \
pam-config"

inherit rpm
