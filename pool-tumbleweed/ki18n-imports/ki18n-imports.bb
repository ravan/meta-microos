SUMMARY = "QML components for ki18n Framework"
DESCRIPTION = "This package contains QML imports for the ki18n framework."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "ki18n-imports-5.116.0-1.13.aarch64.rpm"
RPM_HASH = "bf71b83136e46d1ea00fc5b739d678848f4fa7fc1a974425f00f9b10042611b0db3ec758a622647ebee9d25c4ee2b8fe1e43a09a6e86abc7dc711657dd116d27"

RPROVIDES:${PN} += "ki18n-imports \
libki18nlocaledataqmlplugin.so \
qt5qmlimport-org.kde.i18n.localeData.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5I18nLocaleData.so.5 \
libQt5Core.so.5 \
libQt5Qml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
