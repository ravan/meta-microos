SUMMARY = "Framework for downloading and sharing additional application data"
DESCRIPTION = "The KNewStuff library implements collaborative data sharing for \
applications. It uses libattica to support the Open Collaboration Services \
specification."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-knewstuff-imports-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "6cc0840c57532d3a830ff2dd145aee492002185e996f9d419628a565adcc2ebff2b52a6934929bce2e7fc0cbba1e580d556c6921b1baac4411259a04e97a154f"

RPROVIDES:${PN} += "kf6-knewstuff-imports \
libnewstuffqmlplugin.so \
libnewstuffqmlpluginprivate.so \
qt6qmlimport-org.kde.newstuff \
qt6qmlimport-org.kde.newstuff.1 \
qt6qmlimport-org.kde.newstuff.core \
qt6qmlimport-org.kde.newstuff.core.1 \
qt6qmlimport-org.kde.newstuff.private \
qt6qmlimport-org.kde.newstuff.private.1"

RDEPENDS:${PN} += "kf6-kirigami-imports \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6NewStuffCore.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-QtQuick.Templates \
qt6qmlimport-org.kde.coreaddons \
qt6qmlimport-org.kde.kcmutils \
qt6qmlimport-org.kde.kirigami \
qt6qmlimport-org.kde.kirigami.delegates"

inherit rpm
