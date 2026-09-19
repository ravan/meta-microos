SUMMARY = "Development files for QCustomPlot - Qt6"
DESCRIPTION = "This package contains libraries and header files for \
developing applications that use QCustomPlot - Qt6."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.1"

RPM_NAME = "qcustomplot-qt6-devel-2.1.1-5.5.aarch64.rpm"
RPM_HASH = "2bb8a4a3dcfcd7f2b92795c49d4094ca8ac7805c59f44fa989188d5520cdd312ef2b5ab9e6ee023bb16b457db091a7cc87272b54838ba8a8d787a4351d79df00"

RPROVIDES:${PN} += "pkgconfig-qcustomplot-qt6 \
qcustomplot-qt6-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libqcustomplot-qt6-2 \
pkgconfig-Qt6PrintSupport"

inherit rpm
