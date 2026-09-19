SUMMARY = "Testsuite results"
DESCRIPTION = "Results from running the gcc and target library testsuites."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "16.2.0+git9497"

RPM_NAME = "gcc16-testresults-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "80267b38e446e2fa4bc60b057a35956136d6fe48985c9c8519d84c4000dcf09e9e8a89c44dd11154f4436db8c1ebfebe5ea3788d6fcd86d15c2aea6909ea9f8f"

RPROVIDES:${PN} += "gcc16-testresults"

RDEPENDS:${PN} += ""

inherit rpm
