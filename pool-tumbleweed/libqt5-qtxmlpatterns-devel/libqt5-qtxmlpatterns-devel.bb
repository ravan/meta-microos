SUMMARY = "Development files for the Qt5 XML Patterns library"
DESCRIPTION = "You need this package if you want to compile programs with QtXmlPatterns."
LICENSE = "(LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "5.15.19+kde0"

RPM_NAME = "libqt5-qtxmlpatterns-devel-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "81242f8f4075318ba3a106e6960361632dc262ae4f381f19c8ab0836179d0c4d4d7e700615a756d70376d0a70d6f5f9cb1af03f89575d9c51f0e8f50fee7031c"

RPROVIDES:${PN} += "cmake-Qt5XmlPatterns \
libQt5XmlPatterns-devel \
libqt5-qtxmlpatterns-devel \
pkgconfig-Qt5XmlPatterns"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5XmlPatterns5 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Network"

inherit rpm
