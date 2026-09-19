SUMMARY = "Set of item models extending the Qt model-view framework"
DESCRIPTION = "KItemModels provides a set of item models extending the Qt model-view framework. \
This package provides support to use KItemModels with the QtQuick framework."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kitemmodels-imports-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "301fa63c95f4701241c3e1e2d7170f1b3cacc98b45e2e5dac9b265d073ee494eb402f4f2220a175df9365562a64a9808f4d668fce91a1d160afadd8ec78ca832"

RPROVIDES:${PN} += "kf6-kitemmodels-imports \
libitemmodelsplugin.so \
qt6qmlimport-org.kde.kitemmodels \
qt6qmlimport-org.kde.kitemmodels.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ItemModels.so.6 \
libKF6ItemModels6 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
