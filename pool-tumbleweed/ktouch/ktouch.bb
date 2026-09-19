SUMMARY = "Touch Typing Tutor"
DESCRIPTION = "A KDE program that helps you to learn and practice touch typing."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "ktouch-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "adf575cb73249c9351c8796d7f4fc342a1d7d9799273b0e7f183bf42252c8e8eee1acf3bc67adc31e683af728f7ab8c0bf910267b91bdc3321a4f82f713e828c"

RPROVIDES:${PN} += "ktouch"

RDEPENDS:${PN} += "kf6-kcoreaddons-imports \
kf6-kirigami-imports \
kf6-kquickcharts \
kqtquickcharts \
ld-linux-aarch64.so.1 \
libKF6ColorScheme.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6ItemViews.so.6 \
libKF6KCMUtils.so.6 \
libKF6TextWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickControls2.so.6 \
libQt6QuickWidgets.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
libxml2.so.16 \
qt6-declarative-imports \
qt6-qt5compat-imports \
qt6-sql-sqlite"

inherit rpm
