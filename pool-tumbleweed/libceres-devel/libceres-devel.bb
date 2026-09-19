SUMMARY = "Ceres Solver header files"
DESCRIPTION = "Ceres Solver is a C++ library for modeling and solving large, \
complicated optimization problems. It can be used to solve Non-linear Least \
Squares problems with bounds constraints and general unconstrained optimization \
problems. \
 \
This package is built with Eigen only."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "libceres-devel-2.2.0-3.3.aarch64.rpm"
RPM_HASH = "0eb48896c686e5a62b132d19171ef4defdf015a2b1ddfbe4dd80e14ef5b320c0f3daf747a685093c40fb5ca27c4dcc9af2593c5ee1b7d3e66824dce692060099"

RPROVIDES:${PN} += "cmake-Ceres \
libceres-devel"

RDEPENDS:${PN} += "eigen3-devel \
glog-devel \
libceres4 \
suitesparse-devel"

inherit rpm
