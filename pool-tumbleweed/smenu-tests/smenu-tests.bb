SUMMARY = "Testing system for smenu"
DESCRIPTION = "This packages contains some scripts and a number of tests to check the \
smenu tool."
LICENSE = "GPL-2.0-only"

PV = "1.5.0"

RPM_NAME = "smenu-tests-1.5.0-1.5.noarch.rpm"
RPM_HASH = "30626850c899cbb70b61d0379614e01deba902e64e1dce3874c2edac747c9d6a6e9cd90d3a8619efb95670b6f73972461801fde159e53a0ea2c8dbca8e0d99ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "smenu-tests"

RDEPENDS:${PN} += "smenu"

inherit rpm
