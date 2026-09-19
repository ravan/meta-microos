SUMMARY = "Testsuite results"
DESCRIPTION = "Results from running the gcc and target library testsuites."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "7.5.0+r278197"

RPM_NAME = "gcc7-testresults-7.5.0+r278197-24.2.aarch64.rpm"
RPM_HASH = "9f532a74cff4625dbb10070dec84f7a150ae27dd5f66b08621f4c35c58add3aa45ad23c6ce42a66a8bc6a238fc33305c3ec6af0b19d2aa62038b0b4e7b346f08"

RPROVIDES:${PN} += "gcc7-testresults"

RDEPENDS:${PN} += ""

inherit rpm
