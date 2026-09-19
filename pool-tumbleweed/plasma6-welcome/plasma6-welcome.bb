SUMMARY = "Onboarding wizard for Plasma"
DESCRIPTION = "Welcome Center is the perfect introduction to KDE Plasma! It can help you learn \
how to connect to the internet, install apps, customize the system, and more!"
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "6.7.5"

RPM_NAME = "plasma6-welcome-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "30ff673acf1667463bfe583bd1fd1c71134eff5bdbafdc3767bd56c117ecc80e722fd6442987c7f1759a71a76364b8ebad36c2dd3aa0a5e22698ed022ca716a1"

RPROVIDES:${PN} += "plasma5-welcome \
plasma6-welcome \
qt6qmlimport-org.kde.plasma.welcome \
qt6qmlimport-org.kde.plasma.welcome.254"

RDEPENDS:${PN} += "kf6-kirigami-imports \
kirigami-addons6 \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6GlobalAccel.so.6 \
libKF6I18n.so.6 \
libKF6I18nQml.so.6 \
libKF6JobWidgets.so.6 \
libKF6KCMUtilsQuick.so.6 \
libKF6KIOGui.so.6 \
libKF6Service.so.6 \
libKF6WindowSystem.so.6 \
libPlasma.so.7 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Effects \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-org.kde.kirigami \
wallpaper-branding-openSUSE"

inherit rpm
