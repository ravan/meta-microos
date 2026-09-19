SUMMARY = "Development files for qxtglobalshortcut"
DESCRIPTION = "This package provides header files and documentation for developing \
applications using qxtglobalshortcut library."
LICENSE = "BSD-Source-Code"

PV = "0.0.1+git1533120914.688715b"

RPM_NAME = "qxtglobalshortcut-devel-0.0.1+git1533120914.688715b-1.34.aarch64.rpm"
RPM_HASH = "a4fce378067117aa27e703a28416c83e52291e7fd9db3efa58a4edc99fcb5ccf70bdfbe5f79602cb53c947d3f02fc17cda141633acf83aaf9133eae636ae0296"

RPROVIDES:${PN} += "cmake-qxtglobalshortcut \
pkgconfig-qxtglobalshortcut \
qxtglobalshortcut-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libqxtglobalshortcut0 \
pkgconfig-Qt5Widgets"

inherit rpm
