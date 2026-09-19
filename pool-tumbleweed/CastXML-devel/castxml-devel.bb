SUMMARY = "C-family Abstract Syntax Tree XML Output"
DESCRIPTION = "CastXML is a C-family abstract syntax tree XML output tool."
LICENSE = "Apache-2.0"

PV = "0.7.0"

RPM_NAME = "CastXML-devel-0.7.0-1.7.aarch64.rpm"
RPM_HASH = "527519b35adc48db9561c619b2dbaa8e63e1918c42215bc64d405b40cdd5d3d081739b3b5f486db41e34038da9fa4dec2ec5400be1b24e456d977b30fb6e8576"

RPROVIDES:${PN} += "CastXML-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLLVM.so.22.1 \
libc.so.6 \
libclang-cpp.so.22.1 \
libstdc++.so.6"

inherit rpm
