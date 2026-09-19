SUMMARY = "Non-ABI stable API for the Qt 6 LabsQmlModels library"
DESCRIPTION = "Development files for the Qt 6 LabsQmlModels library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-labsqmlmodels-private-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "369ec7b3406c7fd46096f05d2daaa5839c33c16ab521cb8d6e0537e3d0126d7a7c658e1d93599fddb2c6019aba94d13e9e25fc1652cd6bd309b5b0f56d917a31"

RPROVIDES:${PN} += "cmake-Qt6LabsQmlModels \
cmake-Qt6LabsQmlModelsPrivate \
pkgconfig-Qt6LabsQmlModels \
qt6-labsqmlmodels-devel \
qt6-labsqmlmodels-private-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6QmlModelsPrivate \
cmake-Qt6QmlPrivate \
libQt6LabsQmlModels6"

inherit rpm
