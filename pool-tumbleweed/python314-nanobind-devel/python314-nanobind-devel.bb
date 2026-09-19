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

RPM_NAME = "python314-nanobind-devel-2.15.0-1.1.noarch.rpm"
RPM_HASH = "ae31528fd0ad7309f37ff2e9c5f755bcacf138103690d82499a267b15691f05e898feee00debc16e0dcdcc6fef87bed3790c60abd503134be1818ff21d147a9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-nanobind-devel"

RDEPENDS:${PN} += "gcc-c++ \
nanobind-common-devel \
python314-devel \
python314-nanobind \
robin-map-devel"

inherit rpm
