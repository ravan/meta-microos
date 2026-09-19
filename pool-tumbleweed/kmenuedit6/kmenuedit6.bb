SUMMARY = "Provides the interface and basic tools for the KDE workspace"
DESCRIPTION = "Provides the interface and basic tools for the KDE workspace."
LICENSE = "GPL-2.0-only"

PV = "6.7.5"

RPM_NAME = "kmenuedit6-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "a19d66ac34200460280d328736727a573de54aab581924dd480a7178ff36c822d5cfd04bc4c65d18f362de228ede0ef8e0f6e0f9a5d5829eb65fbd671e1b21d7"

RPROVIDES:${PN} += "kmenuedit5 \
kmenuedit6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6GlobalAccel.so.6 \
libKF6I18n.so.6 \
libKF6IconWidgets.so.6 \
libKF6ItemViews.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Service.so.6 \
libKF6SonnetCore.so.6 \
libKF6SonnetUi.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
