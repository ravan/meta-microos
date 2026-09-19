SUMMARY = "Additional Plasma6 Widgets"
DESCRIPTION = "Additional plasmoids from upstream for use on the Plasma workspace."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-only"

PV = "6.7.5"

RPM_NAME = "kdeplasma6-addons-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "5cd2d6c181aef8ef4811a94492d4dca094bd2aada7e353e747ac723e3319aeaa50ced82121666afd4c3c4ff29edc587e07c9acc8fad41c5603798647063fab0d"

RPROVIDES:${PN} += "kdeplasma6-addons \
libdictplugin.so \
libfifteenpuzzleplugin.so \
libplasma-wallpaper-potdplugin.so \
libplasmacalendaralternatecalendarconfig.so \
libplasmacalendarastronomicaleventsconfig.so \
libplasmapotdprovidercore.so.2 \
libplasmaweatherdata.so.6 \
libplasmaweatherion.so.6 \
libprofiles-qml-plugin.so \
plasma-addons \
plasma5-addons \
qt6qmlimport-org.kde.plasma.private.alternatecalendarconfig \
qt6qmlimport-org.kde.plasma.private.alternatecalendarconfig.254 \
qt6qmlimport-org.kde.plasma.private.alternatecalendarconfig.6 \
qt6qmlimport-org.kde.plasma.private.dict \
qt6qmlimport-org.kde.plasma.private.dict.1 \
qt6qmlimport-org.kde.plasma.private.dict.254 \
qt6qmlimport-org.kde.plasma.private.fifteenpuzzle \
qt6qmlimport-org.kde.plasma.private.fifteenpuzzle.0 \
qt6qmlimport-org.kde.plasma.private.fifteenpuzzle.254 \
qt6qmlimport-org.kde.plasma.private.profiles \
qt6qmlimport-org.kde.plasma.private.profiles.1 \
qt6qmlimport-org.kde.plasma.private.profiles.254 \
qt6qmlimport-org.kde.plasma.wallpapers.potd \
qt6qmlimport-org.kde.plasma.wallpapers.potd.1 \
qt6qmlimport-org.kde.plasmacalendar.astronomicaleventsconfig \
qt6qmlimport-org.kde.plasmacalendar.astronomicaleventsconfig.1 \
qt6qmlimport-org.kde.plasmacalendar.astronomicaleventsconfig.254"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-kitemmodels-imports \
kf6-purpose \
kirigami-addons6 \
ld-linux-aarch64.so.1 \
libKF6AuthCore.so.6 \
libKF6CalendarEvents.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6DBusAddons.so.6 \
libKF6GlobalAccel.so.6 \
libKF6GuiAddons.so.6 \
libKF6Holidays.so.6 \
libKF6I18n.so.6 \
libKF6JobWidgets.so.6 \
libKF6KCMUtils.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Notifications.so.6 \
libKF6Package.so.6 \
libKF6Runner.so.6 \
libKF6Service.so.6 \
libKF6SonnetCore.so.6 \
libKF6Svg.so.6 \
libKF6UnitConversion.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libPlasma.so.7 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineQuick.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libicui18n.so.78 \
libicuuc.so.78 \
libm.so.6 \
libstdc++.so.6 \
libudev.so.1 \
plasma5support6 \
qt6-quick3d-imports \
qt6qmlimport-Qt5Compat.GraphicalEffects \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Dialogs \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-QtQuick.Templates \
qt6qmlimport-QtQuick.Window \
qt6qmlimport-QtQuick3D \
qt6qmlimport-org.kde.kcmutils \
qt6qmlimport-org.kde.kirigami \
qt6qmlimport-org.kde.kquickcontrols \
qt6qmlimport-org.kde.ksvg \
qt6qmlimport-org.kde.kwin \
qt6qmlimport-org.kde.kwin.private.effects \
qt6qmlimport-org.kde.plasma.components \
qt6qmlimport-org.kde.plasma.core \
qt6qmlimport-org.kde.plasma.extras \
qt6qmlimport-org.kde.plasma.plasmoid"

inherit rpm
