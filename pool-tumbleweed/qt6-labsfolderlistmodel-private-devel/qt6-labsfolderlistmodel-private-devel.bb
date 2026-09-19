SUMMARY = "Non-ABI stable API for the Qt 6 LabsFolderListModel library"
DESCRIPTION = "Development files for the Qt 6 LabsFolderListModel library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-labsfolderlistmodel-private-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "1054fea5cd1dd4ecb911a542ef5cb138c6b93654e42a521e544675d4436cb0ff151edbf0d71a13f1095f2ad4ec9c8b0d3a54079b7869f7bfd236f9ddf4f356d7"

RPROVIDES:${PN} += "cmake-Qt6LabsFolderListModel \
cmake-Qt6LabsFolderListModelPrivate \
pkgconfig-Qt6LabsFolderListModel \
qt6-labsfolderlistmodel-devel \
qt6-labsfolderlistmodel-private-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6CorePrivate \
cmake-Qt6QmlModelsPrivate \
cmake-Qt6QmlPrivate \
libQt6LabsFolderListModel6"

inherit rpm
