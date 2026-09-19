SUMMARY = "Non-ABI stable API for the Qt 6 QuickTemplates2 library"
DESCRIPTION = "Development files for the Qt 6 QuickTemplates2 library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quicktemplates2-private-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "dbebdc835eda1512a4b1c90e69f09c3458c98c569d0991f66a57fc539bdfa7a1e9c56206acab4faa3b2011c12914e5ee51acfa922862637472a3a148ce5d0125"

RPROVIDES:${PN} += "cmake-Qt6QuickTemplates2 \
cmake-Qt6QuickTemplates2Private \
pkgconfig-Qt6QuickTemplates2 \
qt6-quicktemplates2-devel \
qt6-quicktemplates2-private-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Qml \
cmake-Qt6QmlModels \
cmake-Qt6QmlModelsPrivate \
cmake-Qt6Quick \
libQt6QuickTemplates2-6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6QmlModels \
pkgconfig-Qt6Quick"

inherit rpm
