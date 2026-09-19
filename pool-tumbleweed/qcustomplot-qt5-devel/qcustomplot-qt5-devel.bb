SUMMARY = "Development files for QCustomPlot - Qt5"
DESCRIPTION = "This package contains libraries and header files for \
developing applications that use QCustomPlot - Qt5."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.1"

RPM_NAME = "qcustomplot-qt5-devel-2.1.1-5.4.aarch64.rpm"
RPM_HASH = "2d0aa0bda501a88d364694c59ad4f18dcf9bde558bf61bcd5fcdecfea11cc1ed286dc0609c1f2dbda6d0dc67ab7dfabad8531865eee7ae7f2004469338143e5f"

RPROVIDES:${PN} += "pkgconfig-qcustomplot \
pkgconfig-qcustomplot-qt5 \
qcustomplot-devel \
qcustomplot-qt5-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libqcustomplot-qt5-2 \
pkgconfig-Qt5PrintSupport"

inherit rpm
