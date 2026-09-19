SUMMARY = "Development headers for Boost.Container"
DESCRIPTION = "Development header files and libraries for Boost.Container. \
Boost.Container library implements several well-known containers, \
including STL containers. The aim of the library is to offers advanced \
features not present in standard containers or to offer the latest \
standard draft features for compilers that don't comply with the latest \
C++ standard. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.91.0"

RPM_NAME = "libboost_container-devel-1.91.0-2.1.aarch64.rpm"
RPM_HASH = "365f87621aeeaad32c4bc4b36b3df09f514d3bf3051c5fce308a273e410cd5cc3a11620084cbc7fea60c1a791a4b98d0b1f4fbde95603b3cbbed374b0e496403"

RPROVIDES:${PN} += "libboost-container-devel"

RDEPENDS:${PN} += "libboost-container1-91-0-devel"

inherit rpm
