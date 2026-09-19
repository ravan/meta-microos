SUMMARY = "Development files for Polly"
DESCRIPTION = "This package contains the development files for Polly."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "21.1.8"

RPM_NAME = "llvm21-polly-devel-21.1.8-9.2.aarch64.rpm"
RPM_HASH = "80f3a46333a3f3f37f11bbf2546d066a5b088766a3c47dcc0f4239583b423e40a8954ef84ec1a3a0399a8858b2dbf6207bc13c297053d2fa786d5ac99edd73cf"

RPROVIDES:${PN} += "cmake-Polly \
llvm-polly-devel-provider \
llvm21-polly-devel"

RDEPENDS:${PN} += "llvm21-devel \
llvm21-polly"

inherit rpm
