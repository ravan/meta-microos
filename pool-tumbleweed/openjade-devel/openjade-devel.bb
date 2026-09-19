SUMMARY = "DSSSL Engine (development package)"
DESCRIPTION = "Libraries and includes to compile applications that use the OpenJade \
framework (package 'openjade')."
LICENSE = "MIT"

PV = "1.3.2"

RPM_NAME = "openjade-devel-1.3.2-375.3.aarch64.rpm"
RPM_HASH = "13b9b148aeb2bf05cd2951da89c9d6aa0f3c54a92e3ef0170548929e555aa4e2f431551a1aafe4762094508bcd57cca0f500aa89051de1a2a5f8a324a4cb42da"

RPROVIDES:${PN} += "openjade-devel"

RDEPENDS:${PN} += "openjade"

inherit rpm
