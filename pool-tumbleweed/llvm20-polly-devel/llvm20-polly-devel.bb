SUMMARY = "Development files for Polly"
DESCRIPTION = "This package contains the development files for Polly."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "20.1.8"

RPM_NAME = "llvm20-polly-devel-20.1.8-8.2.aarch64.rpm"
RPM_HASH = "88eb007c5f2a7f894a01be72522a74b04bec4a7e339d5d794e915c6f445c172626ec5e466176958666ac9b5e96ad5099be083bbbc4b80567aca3eee4719dc03d"

RPROVIDES:${PN} += "cmake-Polly \
llvm-polly-devel-provider \
llvm20-polly-devel"

RDEPENDS:${PN} += "/sbin/ldconfig \
llvm20-devel \
llvm20-polly"

inherit rpm
