SUMMARY = "Documentation for qt6-sensors in QCH format"
DESCRIPTION = "This package contains documentation for qt6-sensors in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-sensors-docs-qch-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "2fd1053dca2140cfead30442932161fe4adc2b675098480bc89accd021a1bd3590775dde2c11b02034e720639a8c1f805339593405bc6bb07e75aa643294be0a"

RPROVIDES:${PN} += "qt6-sensors-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
