SUMMARY = "Documentation for qt6-networkauth in QCH format"
DESCRIPTION = "This package contains documentation for qt6-networkauth in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-networkauth-docs-qch-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "e0144ea8e73963eb3f9c94137551483b5f6b156f1921707ddc6cda85a2076bf02848bfe09ac21a9de3df5db1dc6642813d4ea6448bcc8d92aaf1c307b6b6a232"

RPROVIDES:${PN} += "qt6-networkauth-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
