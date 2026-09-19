SUMMARY = "Testsuite results"
DESCRIPTION = "Results from running the gcc and target library testsuites."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "13.5.0+git10516"

RPM_NAME = "gcc13-testresults-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "2550bcba3bdf9f4d6c98eb024afbfb488d9439bdf269c22de7713e350fdde74b3f4dfc064e47cc70293609c283d964abb415e6ab8c444dc383785031aa7b1838"

RPROVIDES:${PN} += "gcc13-testresults"

RDEPENDS:${PN} += ""

inherit rpm
