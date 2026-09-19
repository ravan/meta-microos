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

RPM_NAME = "nanobind-common-devel-2.15.0-1.1.noarch.rpm"
RPM_HASH = "433cbdea3d8b704bbce30a0187370a10e8a8d84ff0cc4670145e1ed714496c4062951aafcb0aa063ca8ed6dc1abff05abc841e97c130dc6a844b07cb8b4e65ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nanobind-common-devel"

RDEPENDS:${PN} += ""

inherit rpm
