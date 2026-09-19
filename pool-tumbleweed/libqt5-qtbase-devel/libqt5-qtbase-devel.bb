SUMMARY = "Development files for the Qt5 base library"
DESCRIPTION = "You need this package if you want to compile programs with Qt. It \
contains the 'Qt Crossplatform Development Kit'. It does contain \
include files and development applications like GUI designers, \
translator tools and code generators."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.19+kde96"

RPM_NAME = "libqt5-qtbase-devel-5.15.19+kde96-1.3.aarch64.rpm"
RPM_HASH = "e1514bb8269d22051c1384b6f78c074a6cadcf57a29d0e49f14a1e818499fccabd0bc98fc7148915b31481ae269f4a416b8f1eef428ece6dedb52ce7301c6144"

RPROVIDES:${PN} += "libqt5-qtbase-devel"

RDEPENDS:${PN} += "libQt5Concurrent-devel \
libQt5Core-devel \
libQt5DBus-devel \
libQt5Gui-devel \
libQt5Network-devel \
libQt5OpenGL-devel \
libQt5PlatformHeaders-devel \
libQt5PrintSupport-devel \
libQt5Sql-devel \
libQt5Test-devel \
libQt5Widgets-devel \
libQt5Xml-devel \
libqt5-qtbase-common-devel"

inherit rpm
