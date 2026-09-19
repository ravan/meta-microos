SUMMARY = "Development headers for Boost.Regex library"
DESCRIPTION = "This package contains development headers for Boost.Regex library. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.91.0"

RPM_NAME = "libboost_regex-devel-1.91.0-2.1.aarch64.rpm"
RPM_HASH = "d52b960663e4d25dc74c49bdaa1a46bc34901f2938f33f91b007335c05f5f9c231368998935d253bc996291c25fa12f13e3ea1ccf065bafa05e1d299d9b37ed3"

RPROVIDES:${PN} += "libboost-regex-devel"

RDEPENDS:${PN} += "libboost-regex1-91-0-devel"

inherit rpm
