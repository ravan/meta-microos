SUMMARY = "Module for operability between C++11 and Python"
DESCRIPTION = "pybind11 is a header-only library that exposes C++ types in Python \
and vice versa, mainly to create Python bindings of existing C++ \
code. It can reduce boilerplate code in traditional extension modules \
by inferring type information using compile-time introspection."
LICENSE = "BSD-3-Clause"

PV = "3.0.4"

RPM_NAME = "python313-pybind11-3.0.4-1.3.noarch.rpm"
RPM_HASH = "101b7e213ab8cd83673f5d2f4c405da8cf8ddf0b646ebbb2ee4448ecf4b3e19fa300799f0bcdca3794899f8121ba52d834104ed9de511cb2be89ae6cf9907614"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pybind11 \
python3.13dist-pybind11 \
python313-pybind11 \
python3dist-pybind11"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
