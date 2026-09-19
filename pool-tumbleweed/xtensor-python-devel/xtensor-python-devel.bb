SUMMARY = "Development files for xtensor-python"
DESCRIPTION = "Enables inplace use of numpy arrays in C++ with all the benefits from xtensor: \
  * C++ universal function and broadcasting, \
  * STL - compliant APIs, \
  * A broad coverage of numpy APIs. \
 \
The Python bindings for xtensor are based on the pybind11 C++ library, which \
enables seamless interoperability between C++ and Python."
LICENSE = "BSD-3-Clause"

PV = "0.29.0"

RPM_NAME = "xtensor-python-devel-0.29.0-2.3.noarch.rpm"
RPM_HASH = "86ea81bc06a181b4d49f3461a20d0402c61f7cdc054dd095dc6a94d25279a5d8e89d95a52d0d3744b0d2494d1368be198fdd20d89950ff0b914f323655f333c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmake-xtensor-python \
pkgconfig-xtensor-python \
xtensor-python-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
xtensor-devel"

inherit rpm
