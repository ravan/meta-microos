SUMMARY = "KDE's control center"
DESCRIPTION = "This package provides modules to control settings of Plasma and other \
applications by KDE."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "systemsettings6-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "d0dd8fc57d44ac36a4608f3fb2f81fd7b9950145f0bf0e397f10cdc77c2559941637c5b1e7d89d59c82359049ae9126a59faffc6ed916b2b8eeabf926d90c87f"

RPROVIDES:${PN} += "systemsettings5 \
systemsettings6"

RDEPENDS:${PN} += "kf6-kirigami-imports \
ld-linux-aarch64.so.1 \
libKF6AuthCore.so.6 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6I18nQml.so.6 \
libKF6ItemModels.so.6 \
libKF6ItemViews.so.6 \
libKF6JobWidgets.so.6 \
libKF6KCMUtils.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6Runner.so.6 \
libKF6Service.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libKF6XmlGui.so.6 \
libPlasmaActivities.so.7 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
