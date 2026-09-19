SUMMARY = "Documentation for qt6-connectivity in QCH format"
DESCRIPTION = "This package contains documentation for qt6-connectivity in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-connectivity-docs-qch-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "a86ca7bf2fdf18cf35dba63a08268fe60aacfb63b778d06745ea83dd806d9abaea0efec6ebc35a03f2cf65c088ae5c2841fd421c5a2df12fa0b947c27eee48d2"

RPROVIDES:${PN} += "qt6-connectivity-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
