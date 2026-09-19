SUMMARY = "Non-ABI stable API for the Qt 6 XML library"
DESCRIPTION = "This package provides private headers of libQt6Xml that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-xml-private-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "bfc3f91f8053e0bcc686b383008b0191638c77a948973906218d82c3e7725c1d1ab8ef05e42ba019a623b140b43258341d86ad99541fa4b1541e88f44159db1d"

RPROVIDES:${PN} += "cmake-Qt6XmlPrivate \
qt6-xml-private-devel"

RDEPENDS:${PN} += "cmake-Qt6CorePrivate \
cmake-Qt6Xml"

inherit rpm
