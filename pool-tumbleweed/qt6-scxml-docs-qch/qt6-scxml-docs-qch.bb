SUMMARY = "Documentation for qt6-scxml in QCH format"
DESCRIPTION = "This package contains documentation for qt6-scxml in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-scxml-docs-qch-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "cc562d495a3097833e89b0bf5a52cc27253c9879caafb1769ab3f4dc4d6446e6b9788c225bd563e68e7c03c813751546e5daf7cda99c575c63246717891d1505"

RPROVIDES:${PN} += "qt6-scxml-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
