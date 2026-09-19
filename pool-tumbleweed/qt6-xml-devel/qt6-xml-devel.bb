SUMMARY = "Development files for the Qt 6 XML library"
DESCRIPTION = "Development files for the Qt 6 XML library. \
 \
(The module is not actively maintained anymore. Please use the \
QXmlStreamReader and QXmlStreamWriter classes in Qt Core instead.)"
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-xml-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "5597c51279e540a0006d7e6179715c8a1c39fb01c2f9ab08f01f0c8daab7dbf27258d60b58107ac3cfe19e5c03fede3d18bda11e8fb5fdc601f247dd6df136e6"

RPROVIDES:${PN} += "cmake-Qt6Xml \
pkgconfig-Qt6Xml \
qt6-xml-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
libQt6Xml6 \
pkgconfig-Qt6Core"

inherit rpm
