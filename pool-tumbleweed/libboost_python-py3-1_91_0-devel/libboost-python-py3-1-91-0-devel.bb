SUMMARY = "Development headers for Boost.Python library"
DESCRIPTION = "Development headers for Boost.Python library. This package contains \
library for python3 development for boost."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_python-py3-1_91_0-devel-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "d609fc43235710bc47d64ce4b06c770235057a93feabb39cedc3065575688346dbfdc4c9a452a9d60593f64d0de6b41ee15a615baf5fb6f09c9e9a9a94c75500"

RPROVIDES:${PN} += "libboost-python-py3-1-91-0-devel \
libboost-python3-devel-impl"

RDEPENDS:${PN} += "libboost-container1-91-0-devel \
libboost-graph1-91-0-devel \
libboost-headers1-91-0-devel \
libboost-python-py3-1-91-0"

inherit rpm
