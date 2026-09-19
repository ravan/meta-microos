SUMMARY = "Documentation for qt6-charts in QCH format"
DESCRIPTION = "This package contains documentation for qt6-charts in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-charts-docs-qch-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "ebd5728cbd202cc22507475e6e9f759022543afac0608d238c9c434c65d0151c036fc76e6357f7b2fc3b82f06eab9d2afd47880e23b08e41c56b1552d076ab72"

RPROVIDES:${PN} += "qt6-charts-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
