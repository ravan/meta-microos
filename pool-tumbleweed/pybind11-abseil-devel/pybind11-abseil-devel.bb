SUMMARY = "Development files for pybind11_abseil"
DESCRIPTION = "pybind11-abseil provides adapters that make Abseil types work with Pybind11 bindings. \
 \
This package provides the shared object files for developing against \
pybind11_abseil independent of the python version in use."
LICENSE = "BSD-3-Clause"

PV = "202402.0"

RPM_NAME = "pybind11-abseil-devel-202402.0-3.8.aarch64.rpm"
RPM_HASH = "6d3d65f49629b06df43dfd9166112d9ab194fb0780d8d098f2d200c8160014e2610c12500b68b90d06d235fb3845988c1f80c357ae5922ac2e2eae368a7134d1"

RPROVIDES:${PN} += "cmake-pybind11-abseil \
pybind11-abseil-devel"

RDEPENDS:${PN} += "cmake-absl \
cmake-pybind11"

inherit rpm
