SUMMARY = "Development files for Polly"
DESCRIPTION = "This package contains the development files for Polly."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "22.1.8"

RPM_NAME = "llvm22-polly-devel-22.1.8-3.2.aarch64.rpm"
RPM_HASH = "3d45373adcdf1096e5c0125b59b8a0672a6c79566c253560c0187a5a6bbd1145d21a0f070c97cc09839815e8b1d4bfbf6b234ef28d52f9635c578a39e2a7311d"

RPROVIDES:${PN} += "cmake-Polly \
llvm-polly-devel-provider \
llvm22-polly-devel"

RDEPENDS:${PN} += "llvm22-devel \
llvm22-polly"

inherit rpm
