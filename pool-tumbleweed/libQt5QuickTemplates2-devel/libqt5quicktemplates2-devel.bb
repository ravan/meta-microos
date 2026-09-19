SUMMARY = "Qt Development Kit"
DESCRIPTION = "You need this package if you want to compile programs with qtquickcontrols2."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde5"

RPM_NAME = "libQt5QuickTemplates2-devel-5.15.19+kde5-1.2.aarch64.rpm"
RPM_HASH = "5aa546f9dd747f3f7fb59258869e61234f99274b64f78aa9e67fd87ea5c020ea043f1a137230b7f908ed2550bcc21a796e1087085d343774a12c745a30f7bd7a"

RPROVIDES:${PN} += "cmake-Qt5QuickTemplates2 \
libQt5QuickTemplates2-devel \
pkgconfig-Qt5QuickTemplates2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5QuickTemplates2-5 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5QmlModels \
pkgconfig-Qt5Quick"

inherit rpm
