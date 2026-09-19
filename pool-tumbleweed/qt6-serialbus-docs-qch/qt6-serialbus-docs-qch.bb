SUMMARY = "Documentation for qt6-serialbus in QCH format"
DESCRIPTION = "This package contains documentation for qt6-serialbus in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-serialbus-docs-qch-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "bc4750969ca580e2da8c2617b737c83d178b85cb08477372598ac564c329666588d8147e32d50adfd87be5495da4fb35d5426a6ca2d6d3fe2ec9be3b20f060ca"

RPROVIDES:${PN} += "qt6-serialbus-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
