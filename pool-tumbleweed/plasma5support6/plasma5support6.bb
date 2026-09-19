SUMMARY = "KF6 Porting aid"
DESCRIPTION = "Support components for porting from KF5/Qt5 to KF6/Qt6."
LICENSE = "LGPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "plasma5support6-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "6d1f715fa6abdb2f99adbacd8982b8cf24c43637cdebbb60db6bc87abef9d17769d6fb15db22ad34e327f97dc7aa09e6525ab11e676fb4663232ba482a66b3bd"

RPROVIDES:${PN} += "libplasma5supportplugin.so \
libweather-ion.so.7 \
plasma5support6 \
qt6qmlimport-org.kde.plasma.plasma5support \
qt6qmlimport-org.kde.plasma.plasma5support.2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6GuiAddons.so.6 \
libKF6Holidays.so.6 \
libKF6I18n.so.6 \
libKF6IdleTime.so.6 \
libKF6JobWidgets.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOFileWidgets.so.6 \
libKF6KIOGui.so.6 \
libKF6NetworkManagerQt.so.6 \
libKF6Notifications.so.6 \
libKF6Service.so.6 \
libKF6Solid.so.6 \
libKF6UnitConversion.so.6 \
libPlasma5Support.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Widgets.so.6 \
libX11.so.6 \
libXfixes.so.3 \
libc.so.6 \
libgps.so.32 \
libm.so.6 \
libplasma-geolocation-interface.so.6 \
libprocesscore.so.11 \
libstdc++.so.6"

inherit rpm
