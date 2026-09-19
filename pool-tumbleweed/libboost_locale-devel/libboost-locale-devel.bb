SUMMARY = "Development headers for Boost.Locale library"
DESCRIPTION = "This package contains development headers for Boost.Locale library. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.91.0"

RPM_NAME = "libboost_locale-devel-1.91.0-2.1.aarch64.rpm"
RPM_HASH = "046e681ad0adf3f877c23732237f1d4300e35f3c8d6db639f9cb20a9797447d64664cffde1580e26769a934ca0207f0dba7fe723523a7009d0463acb83ededb2"

RPROVIDES:${PN} += "libboost-locale-devel"

RDEPENDS:${PN} += "libboost-locale1-91-0-devel"

inherit rpm
