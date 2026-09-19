SUMMARY = "Tiny And Efficient C++/Python Bindings"
DESCRIPTION = "nanobind is a small binding library that exposes C++ types in Python \
and vice versa.  It is reminiscent of Boost.Python and pybind11 and \
uses near-identical syntax.  In contrast to these existing tools, \
nanobind is more efficient: bindings compile in a shorter amount of \
time, produce smaller binaries, and have better runtime performance. \
 \
This package contains the Python module."
LICENSE = "BSD-3-Clause"

PV = "2.15.0"

RPM_NAME = "python314-nanobind-2.15.0-1.1.noarch.rpm"
RPM_HASH = "90044d95a075e8d215e36035f3b0e7c1ee2d44fe7ae99566e33b343467fffddfb5daf318eb0e4fc3ce3347e73fdce7f6321445cb15e0c9415c07aad36582d2d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-nanobind"

RDEPENDS:${PN} += "python-abi"

inherit rpm
