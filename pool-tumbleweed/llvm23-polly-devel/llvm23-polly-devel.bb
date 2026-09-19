SUMMARY = "Development files for Polly"
DESCRIPTION = "This package contains the development files for Polly."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "23.1.1"

RPM_NAME = "llvm23-polly-devel-23.1.1-1.1.aarch64.rpm"
RPM_HASH = "dfb32a8d69e81aee4643d9b9f18395a7e08ca31e190ee2d0b041b503e8336fce463b39cd60ce5cb8fc8f47ac0989c3c307700f683201c32835b77e2e1362f3d5"

RPROVIDES:${PN} += "cmake-Polly \
llvm-polly-devel-provider \
llvm23-polly-devel"

RDEPENDS:${PN} += "llvm23-devel \
llvm23-polly"

inherit rpm
