SUMMARY = "Itinerary and boarding pass management application"
DESCRIPTION = "Itinerary and boarding pass management application."
LICENSE = "LGPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "itinerary-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "3b430beb417848d4d5360fae83d0f42bccc0046440c4aa18220d039e8977f321d8abe6df5e1eb8bd1d92145552ddaa04f5bc204307d3040b82ddaaedd7abde9a"

RPROVIDES:${PN} += "itinerary"

RDEPENDS:${PN} += "kf6-breeze-icons \
kf6-kcalendarcore-imports \
kf6-kcontacts-imports \
kf6-kcoreaddons-imports \
kf6-ki18n-imports \
kf6-kirigami-imports \
kf6-kitemmodels-imports \
kf6-knotifications-imports \
kf6-prison-imports \
khealthcertificate-imports \
kirigami-addons6 \
kopeninghours-imports \
kosmindoormap-imports \
kpkpass-imports \
kpublictransport-imports \
ld-linux-aarch64.so.1 \
libKF6CalendarCore.so.6 \
libKF6Contacts.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6FileMetaData.so.3 \
libKF6Holidays.so.6 \
libKF6I18n.so.6 \
libKF6I18nLocaleData.so.6 \
libKF6I18nQml.so.6 \
libKF6KIOGui.so.6 \
libKF6Notifications.so.6 \
libKF6UnitConversion.so.6 \
libKF6WindowSystem.so.6 \
libKHealthCertificate.so.1 \
libKOSM.so.1 \
libKOSMIndoorMap.so.1 \
libKPim6Itinerary.so.6 \
libKPim6PkPass.so.6 \
libKPublicTransport.so.1 \
libKPublicTransportOnboard.so.1 \
libQCoro6Core.so.0 \
libQCoro6Network.so.0 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Positioning.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickControls2.so.6 \
libQt6Widgets.so.6 \
libQuotientQt6.so.0.9 \
libc.so.6 \
libm.so.6 \
libqt6keychain.so.1 \
libstdc++.so.6 \
libz.so.1 \
qt6-declarative-imports \
qt6-location \
qt6-multimedia-imports \
qt6-positioning-imports"

inherit rpm
