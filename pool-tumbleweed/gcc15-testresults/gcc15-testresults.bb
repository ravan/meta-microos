SUMMARY = "Testsuite results"
DESCRIPTION = "Results from running the gcc and target library testsuites."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "15.3.0+git11272"

RPM_NAME = "gcc15-testresults-15.3.0+git11272-1.3.aarch64.rpm"
RPM_HASH = "8a3eed400b6566dddb71e9ccb29a970890074a7a0d39cb3998efa2095b0137461dbf76688d1202359bf23ceabaa683798f7a1d9dcaa22deecc34847342c46da3"

RPROVIDES:${PN} += "gcc15-testresults"

RDEPENDS:${PN} += ""

inherit rpm
