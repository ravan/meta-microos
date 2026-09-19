SUMMARY = "Documentation for qt6-mqtt in QCH format"
DESCRIPTION = "This package contains documentation for qt6-mqtt in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-mqtt-docs-qch-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "ec31d660b4fbf3319e31a100e6e3850b8b4a6fb80bfd0eb532db46bb7f269aff82a4a7f2b43f23ffca06210f33f0e5e8b795936b803cb2b7824326c2e861fd84"

RPROVIDES:${PN} += "qt6-mqtt-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
