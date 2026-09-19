SUMMARY = "QML components for ki18n Framework"
DESCRIPTION = "This package contains QML imports for the ki18n framework."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-ki18n-imports-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "aa3c20db3f0aae7032f558be08ce955cf032f6556db202d3d513ec506d992675e6df8721810821f3262d216f567d629a35b84392aa038ce00ac97ae4458de523"

RPROVIDES:${PN} += "kf6-ki18n-imports \
libKF6I18nQmlplugin.so \
libki18nlocaledataqmlplugin.so \
qt6qmlimport-org.kde.i18n.localeData \
qt6qmlimport-org.kde.i18n.localeData.1 \
qt6qmlimport-org.kde.ki18n \
qt6qmlimport-org.kde.ki18n.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6I18nLocaleData.so.6 \
libKF6I18nQml.so.6 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
