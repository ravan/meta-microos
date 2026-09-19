SUMMARY = "Set of item models extending the Qt model-view framework"
DESCRIPTION = "KItemModels provides a set of item models extending the Qt model-view framework. This package \
provides support to use KItemModels with the QtQuick framework."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "kitemmodels-imports-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "28a88d99c5ebbb84f6f77a6a45ea9c4758d8912dba58cc75377897127b5edad296c2794a528efe464b9cb10cd1874415fce5a7dd1254544900a899ee3cb76802"

RPROVIDES:${PN} += "kitemmodels-imports \
libitemmodelsplugin.so \
qt5qmlimport-org.kde.kitemmodels.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ItemModels.so.5 \
libKF5ItemModels5 \
libQt5Core.so.5 \
libQt5Qml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
