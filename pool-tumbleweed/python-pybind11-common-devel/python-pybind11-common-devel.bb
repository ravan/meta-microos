SUMMARY = "Development files for pybind11"
DESCRIPTION = "This package contains files for developing applications using pybind11."
LICENSE = "BSD-3-Clause"

PV = "3.0.4"

RPM_NAME = "python-pybind11-common-devel-3.0.4-1.3.noarch.rpm"
RPM_HASH = "39970a318bd68c4bd3982c65d5950af07fc83cbe9dbc3ce52b9fced1b37ae39e077521f7b756dd31d10d3d8b94df2e9dea5177c53b4e95e4d60f367f226e274c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmake-pybind11 \
pkgconfig-pybind11 \
python-pybind11-common-devel \
python313-pybind11-common-devel \
python314-pybind11-common-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
