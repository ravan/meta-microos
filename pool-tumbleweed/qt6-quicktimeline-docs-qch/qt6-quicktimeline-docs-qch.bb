SUMMARY = "Documentation for qt6-quicktimeline in QCH format"
DESCRIPTION = "This package contains documentation for qt6-quicktimeline in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-quicktimeline-docs-qch-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "2a7f8495d6dd111089f8b0b00539faa82a4421e4db777e5c013e0a83fa103246f4c4a573f5a4c5ede4d08c76771a99a1612b29ed2cfa4d7d6049bb45d9d7a84a"

RPROVIDES:${PN} += "qt6-quicktimeline-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
