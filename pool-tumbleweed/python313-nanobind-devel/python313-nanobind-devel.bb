SUMMARY = "Tiny And Efficient C++/Python Bindings"
DESCRIPTION = "nanobind is a small binding library that exposes C++ types in Python \
and vice versa.  It is reminiscent of Boost.Python and pybind11 and \
uses near-identical syntax.  In contrast to these existing tools, \
nanobind is more efficient: bindings compile in a shorter amount of \
time, produce smaller binaries, and have better runtime performance. \
 \
This package contains files for developing applications using nanobind."
LICENSE = "BSD-3-Clause"

PV = "2.15.0"

RPM_NAME = "python313-nanobind-devel-2.15.0-1.1.noarch.rpm"
RPM_HASH = "55b8a18b293dbf9030fa287e0d816d6290618f5a82b9c40e655831839c0252e8afc5158dbc51667291fb556ced41f74588b7de2d673ad272fe79d9080a108e12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nanobind-devel \
python313-nanobind-devel"

RDEPENDS:${PN} += "gcc-c++ \
nanobind-common-devel \
python313-devel \
python313-nanobind \
robin-map-devel"

inherit rpm
