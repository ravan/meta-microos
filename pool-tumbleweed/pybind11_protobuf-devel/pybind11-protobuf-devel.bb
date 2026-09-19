SUMMARY = "Development files for pybind11_protobuf"
DESCRIPTION = "Headers and other development files for pybind11_protobuf"
LICENSE = "BSD-3-Clause"

PV = "0~git20250210.f02a2b7"

RPM_NAME = "pybind11_protobuf-devel-0~git20250210.f02a2b7-1.4.aarch64.rpm"
RPM_HASH = "1867b772ab17cf028c2b7dcc8c9f991708347711a9e71921be587535815f07e8842af8da84068eab7a7c097f73bb7cbb0102ae621b488aa8348345e088d81851"

RPROVIDES:${PN} += "cmake-pybind11-protobuf \
pybind11-protobuf-devel"

RDEPENDS:${PN} += "pybind11-protobuf"

inherit rpm
