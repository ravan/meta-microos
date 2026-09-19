SUMMARY = "Header-only c++ library for parsing TOML"
DESCRIPTION = "cpptoml is a header-only c++ library for parsing TOML configuration files. \
 \
This package contains development headers for the cpptoml library"
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "cpptoml-devel-0.1.1-3.18.aarch64.rpm"
RPM_HASH = "16cb0b215a8f5c509cc63afd745de1d226c588eb722ea3d3356cf28b8f74302b9f2066721ee4b0fc5d60933fd42adbc9f938a7f4c7334a77edebb86b5ddda5c9"

RPROVIDES:${PN} += "cmake-cpptoml \
cpptoml-devel"

RDEPENDS:${PN} += ""

inherit rpm
