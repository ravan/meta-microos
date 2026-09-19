SUMMARY = "Development files for the Qt5 Data Visualization module"
DESCRIPTION = "This package provides header files and shared libraries for development with \
Qt Data Visualization."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.19+kde0"

RPM_NAME = "libQt5DataVisualization5-devel-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "85de5992c7b643a40be562aa205c92d7779f4b1d6669ae9f203dc23b1f3ebd5f106172bc9bf75882f6db258804cf54c3af6f9c52c6eadfba77a2fb5c1b770588"

RPROVIDES:${PN} += "cmake-Qt5DataVisualization \
libQt5DataVisualization5-devel \
pkgconfig-Qt5DataVisualization"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5DataVisualization5 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui"

inherit rpm
