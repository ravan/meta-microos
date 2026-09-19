SUMMARY = "Development files for the Qt5 print support library"
DESCRIPTION = "Development files for the Qt5 print support library."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.19+kde96"

RPM_NAME = "libQt5PrintSupport-devel-5.15.19+kde96-1.3.aarch64.rpm"
RPM_HASH = "270a11924d1218688649011fe7831d03bdb911e985be726442a3be212b9556dacff5bb2838c16e1b4c036bfbe0641e79bcaee28fdc0917f5c6605360203e97d4"

RPROVIDES:${PN} += "cmake-Qt5PrintSupport \
libQt5PrintSupport-devel \
pkgconfig-Qt5PrintSupport"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Core-devel \
libQt5Gui-devel \
libQt5PrintSupport5 \
libQt5Widgets-devel \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5Widgets"

inherit rpm
