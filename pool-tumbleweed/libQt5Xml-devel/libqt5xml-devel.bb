SUMMARY = "Development files for the Qt5 XML library"
DESCRIPTION = "Development files for the Qt5 XML library. \
 \
(The module is not actively maintained anymore. Please use the \
QXmlStreamReader and QXmlStreamWriter classes in Qt Core instead.)"
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.19+kde96"

RPM_NAME = "libQt5Xml-devel-5.15.19+kde96-1.3.aarch64.rpm"
RPM_HASH = "b6712faa3d04470c23a5424a05688f2b7d5a3e49b559d40b2f609905325179b72a6885a202bedc8242805b9a66e203c33085dec548e39c21588d7e3cfdec0c20"

RPROVIDES:${PN} += "cmake-Qt5Xml \
libQt5Xml-devel \
pkgconfig-Qt5Xml"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Core-devel \
libQt5Xml5 \
pkgconfig-Qt5Core"

inherit rpm
