SUMMARY = "Module for operability between C++11 and Python"
DESCRIPTION = "pybind11 is a header-only library that exposes C++ types in Python \
and vice versa, mainly to create Python bindings of existing C++ \
code. It can reduce boilerplate code in traditional extension modules \
by inferring type information using compile-time introspection."
LICENSE = "BSD-3-Clause"

PV = "3.0.4"

RPM_NAME = "python314-pybind11-3.0.4-1.3.noarch.rpm"
RPM_HASH = "55999cff3b448d7a5e1f385ba5d1b40c7f5d0fd5807b0f2ebf4e4182db089bf2734d5c80063a99857d40593b131ad08cffca517cb9982f43ca4bd0aa04c95d51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pybind11 \
python314-pybind11 \
python3dist-pybind11"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
