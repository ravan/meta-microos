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

RPM_NAME = "python313-nanobind-2.15.0-1.1.noarch.rpm"
RPM_HASH = "cf2899b0ed829cd8e3ecd01b0813905d150446d751e39c89afa8c5c10875b3fbf52feb207987b3b5e71b647845042ad22b76a5c4487f01e449a89df0ef6bb734"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nanobind \
python313-nanobind"

RDEPENDS:${PN} += "python-abi"

inherit rpm
