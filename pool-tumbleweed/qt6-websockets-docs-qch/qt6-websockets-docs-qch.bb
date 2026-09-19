SUMMARY = "Documentation for qt6-websockets in QCH format"
DESCRIPTION = "This package contains documentation for qt6-websockets in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-websockets-docs-qch-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "1013d7f015d9f3b750cef24c939a06532ae229e3bb27d2e3f1cd10bd08ed64017f3982dcbd4502ce44ef592b022ba8594c727e4eb066ce19f5608b47404571a1"

RPROVIDES:${PN} += "qt6-websockets-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
