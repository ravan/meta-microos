SUMMARY = "Documentation for xtensor-python"
DESCRIPTION = "Enables inplace use of numpy arrays in C++ with all the benefits from xtensor: \
  * C++ universal function and broadcasting, \
  * STL - compliant APIs, \
  * A broad coverage of numpy APIs. \
 \
The Python bindings for xtensor are based on the pybind11 C++ library, which \
enables seamless interoperability between C++ and Python."
LICENSE = "BSD-3-Clause"

PV = "0.29.0"

RPM_NAME = "xtensor-python-doc-0.29.0-2.3.noarch.rpm"
RPM_HASH = "aea7c50f15a7d1f232dd710eaa89a275aa13fae8b7ec72da2c2986781b27346395eddaf2342f677bbbfbb2f976a495e0af0935bd7bb00f958b948cb96c7bdb93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xtensor-python-doc"

RDEPENDS:${PN} += ""

inherit rpm
