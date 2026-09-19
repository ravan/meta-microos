SUMMARY = "Pronunciation Self-Teaching"
DESCRIPTION = "Improve your pronunciation by listening to native speakers."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "artikulate-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "89fb4f1fdda46211d1058ffc7c552e898e2fe47d82c21f6925473ddfd39dbb0d36460dda8f61a458034ea510e2e405535400b84b57405fc550621226f1e743f4"

RPROVIDES:${PN} += "artikulate \
artikulate5 \
libartikulatecore.so.0 \
libartikulatelearnerprofile.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-kirigami-imports \
kf6-knewstuff-imports \
kirigami-addons6 \
ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6ItemModels.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libstdc++.so.6 \
libxml2.so.16 \
qt6-declarative-imports \
qt6-multimedia-imports \
qt6-sql-sqlite"

inherit rpm
