SUMMARY = "Framework for downloading and sharing additional application data"
DESCRIPTION = "The KNewStuff library implements collaborative data sharing for \
applications. It uses libattica to support the Open Collaboration Services \
specification."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-knewstuff-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "4d73a36053a4ca764296caa270e2d8461c27ac4f500bceb87d7aba3ada1e1653fbfd29008653e2ca82f0e272c5b603ff0400989b6934255119930add802f6814"

RPROVIDES:${PN} += "kf6-knewstuff"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6I18n.so.6 \
libKF6I18nQml.so.6 \
libKF6NewStuffCore.so.6 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
