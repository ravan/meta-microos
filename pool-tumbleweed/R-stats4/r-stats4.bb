SUMMARY = "Package providing R-stats4"
DESCRIPTION = "This package provides R-stats4, one of R-core packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.6.1"

RPM_NAME = "R-stats4-4.6.1-58.3.aarch64.rpm"
RPM_HASH = "dc6bc4746efd6aebef2ed2b8b4dfb5ebc2ed113deac9aa057df83de568e19a9b04b02c9f43ae072d8c8251e3ae53e67728aa3baa0099c8672a414117ced901f5"

RPROVIDES:${PN} += "R-stats4"

RDEPENDS:${PN} += "R-base"

inherit rpm
