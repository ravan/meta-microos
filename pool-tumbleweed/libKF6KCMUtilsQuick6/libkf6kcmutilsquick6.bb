SUMMARY = "Classes to work with KCModules"
DESCRIPTION = "KCMUtils provides various classes to work with KCModules. KCModules can be \
created with the KConfigWidgets framework."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6KCMUtilsQuick6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "24db37799b18cb5981b4659a0d9a420ce17881cc111fc0717e6430933cc0688d1248b0d3fbf5add011d27bb5db93f54a499758b795102fe54dbdd7ac2b342870"

RPROVIDES:${PN} += "libKF6KCMUtilsQuick.so.6 \
libKF6KCMUtilsQuick6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6I18nQml.so.6 \
libKF6KCMUtilsCore.so.6 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
