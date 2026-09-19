SUMMARY = "Development headers for Boost.Python library"
DESCRIPTION = "Development headers for Boost.Python library. This package contains \
library for python3 development for boost. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.91.0"

RPM_NAME = "libboost_python3-devel-1.91.0-2.1.aarch64.rpm"
RPM_HASH = "1f1a131c6e536120baf299881e8b99f50c3701802a643498bf915152d87c13e215f4a59968b07c5322901fe53800577cb78f5adf820ee5f99f06d6e1e38d986e"

RPROVIDES:${PN} += "libboost-python3-devel"

RDEPENDS:${PN} += "libboost-python-py3-1-91-0-devel"

inherit rpm
