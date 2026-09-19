SUMMARY = "Documentation for qt6-opcua in QCH format"
DESCRIPTION = "This package contains documentation for qt6-opcua in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-opcua-docs-qch-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "2013ece2d1a993af247c2f8f525f53c85910297070f095a2da67d71f3047b0912cb7da387b75a2e905f4a3bf5e7079173dcdc5a16ad28216e9d4ea369b26be84"

RPROVIDES:${PN} += "qt6-opcua-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
