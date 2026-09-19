SUMMARY = "Verification helper for libalternatives"
DESCRIPTION = "This is a testing-only installation that may be used to verify that successful \
integration with manual pages."
LICENSE = "Apache-2.0"

PV = "2.0+0.4f22c01"

RPM_NAME = "libalternatives-unit-test-helper-2.0+0.4f22c01-1.1.noarch.rpm"
RPM_HASH = "a1489c21879600930f3a63acf6f8ea6bee5e8a0480c1668fe6509e5b6fc4c7580ab69aadb07b0ea4de0ca49a2cd471f6e9f7ea20a2f29d5100dd6e4f8790e4b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libalternatives-unit-test-helper"

RDEPENDS:${PN} += "/usr/bin/bash \
alts"

inherit rpm
