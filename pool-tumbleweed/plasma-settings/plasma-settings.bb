SUMMARY = "Plasma Mobile Settings"
DESCRIPTION = "Settings application for Plasma Mobile."
LICENSE = "GPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "plasma-settings-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "4c7e4ae7c7f9643dee4d9fa6453181a5f155e48e6992eb0c68fa985166ade8e22c740e7c70f36b3dceae843a30a33ec42bd8917a4ccc2a84047b413508a31e67"

RPROVIDES:${PN} += "plasma-settings"

RDEPENDS:${PN} += "kf6-kcmutils-imports \
kf6-kirigami-imports \
kirigami-addons6 \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6I18nQml.so.6 \
libKF6ItemModels.so.6 \
libKF6ItemViews.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6KCMUtilsQuick.so.6 \
libKF6Service.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6QuickControls2.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6-declarative-imports"

inherit rpm
