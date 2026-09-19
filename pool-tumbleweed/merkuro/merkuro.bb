SUMMARY = "Calendar Application"
DESCRIPTION = "Calendar application using Akonadi to sync with external services (NextCloud, GMail, ...)."
LICENSE = "GPL-3.0-only"

PV = "26.08.1"

RPM_NAME = "merkuro-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "76d1fe2a90f78c92f99e1f5564def31950ce7310c34e78eb88ce79818f76741244a582b388a74a80246b439644557faec5fc3a027357c9fa2bcf28695851ff48"

RPROVIDES:${PN} += "kalendar \
libMerkuroComponents.so.6 \
libMerkuroComponentsplugin.so \
libmerkuro-contact.so.6 \
libmerkuro-contactplugin.so \
merkuro \
qt6qmlimport-org.kde.merkuro.components \
qt6qmlimport-org.kde.merkuro.components.1 \
qt6qmlimport-org.kde.merkuro.contact \
qt6qmlimport-org.kde.merkuro.contact.254 \
qt6qmlimport-org.kde.merkuro.contact.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kalendarac \
kdepim-addons \
kdepim-runtime \
kf6-kdeclarative-imports \
kf6-kirigami-imports \
kf6-kitemmodels-imports \
kf6-ksvg-imports \
kidentitymanagement-imports \
ld-linux-aarch64.so.1 \
libKF6CalendarCore.so.6 \
libKF6Codecs.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6Contacts.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6Holidays.so.6 \
libKF6I18n.so.6 \
libKF6I18nQml.so.6 \
libKF6IconThemes.so.6 \
libKF6ItemModels.so.6 \
libKF6KIOCore.so.6 \
libKF6Mime.so.6 \
libKF6Notifications.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libKPim6AkonadiCalendar.so.6 \
libKPim6AkonadiContactCore.so.6 \
libKPim6AkonadiCore.so.6 \
libKPim6AkonadiMime.so.6 \
libKPim6AkonadiSearchPIM.so.6 \
libKPim6AkonadiWidgets.so.6 \
libKPim6IdentityManagementCore.so.6 \
libKPim6IdentityManagementQuick.so.6 \
libKPim6Libkdepim.so.6 \
libKPim6Libkleo.so.6 \
libKPim6MailCommon.so.6 \
libKPim6MailTransport.so.6 \
libKPim6Mbox.so.6 \
libKPim6MessageComposer.so.6 \
libKPim6MessageCore.so.6 \
libKPim6MimeTreeParserCore.so.6 \
libKPim6PimCommonAkonadi.so.6 \
libKirigamiAddonsStatefulApp.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickControls2.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libgpgmepp.so.7 \
libm.so.6 \
libstdc++.so.6 \
mimetreeparser-imports \
qt6-declarative-imports \
qt6-location \
qt6-positioning-imports \
qt6qmlimport-Qt.labs.platform \
qt6qmlimport-Qt.labs.qmlmodels \
qt6qmlimport-Qt5Compat.GraphicalEffects \
qt6qmlimport-QtQml \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Dialogs \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-QtQuick.Templates \
qt6qmlimport-QtQuick.Window \
qt6qmlimport-org.kde.akonadi \
qt6qmlimport-org.kde.contacts \
qt6qmlimport-org.kde.coreaddons \
qt6qmlimport-org.kde.kirigami \
qt6qmlimport-org.kde.kirigamiaddons.components \
qt6qmlimport-org.kde.kirigamiaddons.delegates \
qt6qmlimport-org.kde.kirigamiaddons.formcard \
qt6qmlimport-org.kde.kirigamiaddons.labs.components \
qt6qmlimport-org.kde.kirigamiaddons.statefulapp \
qt6qmlimport-org.kde.kirigamiaddons.statefulapp.labs \
qt6qmlimport-org.kde.kitemmodels \
qt6qmlimport-org.kde.plasma.components \
qt6qmlimport-org.kde.plasma.core \
qt6qmlimport-org.kde.plasma.plasmoid \
qt6qmlimport-org.kde.prison"

inherit rpm
