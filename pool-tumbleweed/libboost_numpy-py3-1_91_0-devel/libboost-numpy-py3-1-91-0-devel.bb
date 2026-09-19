SUMMARY = "Development headers for Boost.Python.NumPy library"
DESCRIPTION = "Development headers for Boost.Python.NumPy library. This package contains \
library for python3 development for boost."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_numpy-py3-1_91_0-devel-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "97796eab38c2bbc46c8bd5510755120afe47c0d9e9d46cc8045f1bb96a196fd656e818b867d8d2d5b7c198da1c504198580f613e2f97ed83c9eb209f95dcdce7"

RPROVIDES:${PN} += "libboost-numpy-py3-1-91-0-devel \
libboost-numpy3-devel-impl"

RDEPENDS:${PN} += "libboost-headers1-91-0-devel \
libboost-numpy-py3-1-91-0"

inherit rpm
