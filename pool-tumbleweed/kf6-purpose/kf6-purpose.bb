SUMMARY = "Framework to integrate services and actions in applications"
DESCRIPTION = "This framework offers the possibility to create integrate services and actions \
on any application without having to implement them specifically. Purpose will \
offer them mechanisms to list the different alternatives to execute given the \
requested action type and will facilitate components so that all the plugins \
can receive all the information they need."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-purpose-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "60e6b3a73954be0a9237f2cabb865bb702f193ce7f3b5be9ec33033c21ff6ac72be3a870549487b03fe77cb866f077ff49998656b93c842a0fbd5d0d3913d6f4"

RPROVIDES:${PN} += "kf6-purpose \
libKF6PurposeWidgetsplugin.so \
libaccountshelper.so \
libkdeconnectQml.so \
libphabricatorquickplugin.so \
libpurposequickplugin.so \
librbpurposequickplugin.so \
qt6qmlimport-org.kde.purpose \
qt6qmlimport-org.kde.purpose.1 \
qt6qmlimport-org.kde.purpose.accountshelper \
qt6qmlimport-org.kde.purpose.accountshelper.254 \
qt6qmlimport-org.kde.purpose.accountshelper.6 \
qt6qmlimport-org.kde.purpose.kdeconnect \
qt6qmlimport-org.kde.purpose.kdeconnect.254 \
qt6qmlimport-org.kde.purpose.kdeconnect.6 \
qt6qmlimport-org.kde.purpose.phabricator \
qt6qmlimport-org.kde.purpose.phabricator.1 \
qt6qmlimport-org.kde.purpose.private.widgets \
qt6qmlimport-org.kde.purpose.private.widgets.254 \
qt6qmlimport-org.kde.purpose.reviewboard \
qt6qmlimport-org.kde.purpose.reviewboard.1"

RDEPENDS:${PN} += "kf6-bluez-qt-imports \
kf6-kdeclarative-imports \
kf6-kirigami-imports \
kf6-prison-imports \
ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Notifications.so.6 \
libKF6Purpose.so.6 \
libKF6PurposeWidgets.so.6 \
libKF6Service.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Widgets.so.6 \
libaccounts-qt6.so.1 \
libc.so.6 \
libkaccounts6.so.2 \
libstdc++.so.6 \
purpose-services \
qt6-declarative-imports \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Dialogs \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-org.kde.bluezqt \
qt6qmlimport-org.kde.ki18n \
qt6qmlimport-org.kde.kirigami \
qt6qmlimport-org.kde.kitemmodels \
qt6qmlimport-org.kde.prison"

inherit rpm
