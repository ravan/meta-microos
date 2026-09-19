SUMMARY = "Testing framework library for Mir"
DESCRIPTION = "This package provides the static library for building Mir unit and integration \
tests"
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "2.28.0"

RPM_NAME = "mir-test-libs-static-2.28.0-1.3.aarch64.rpm"
RPM_HASH = "40e94be393cadf4ebd3ab812c60ab11aab108610a111269fe045011840ef598e87d6dceb3b2e36b602794fb9946d8a573b8ccc8e85932825114d3545804cb9f5"

RPROVIDES:${PN} += "mir-test-libs-static"

RDEPENDS:${PN} += "mir-devel"

inherit rpm
