SUMMARY = "Development files for Polly"
DESCRIPTION = "This package contains the development files for Polly."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "19.1.7"

RPM_NAME = "llvm19-polly-devel-19.1.7-14.3.aarch64.rpm"
RPM_HASH = "5b6d37164258d667001a1fc6d7c99f69600606f53f834e0f6ef5f08aee02708b593af6962c3c0a5dfd70c47b791efd57c7ac36777afd20680a8f0acdcf7e9af0"

RPROVIDES:${PN} += "cmake-Polly \
llvm-polly-devel-provider \
llvm19-polly-devel"

RDEPENDS:${PN} += "/sbin/ldconfig \
llvm19-devel \
llvm19-polly"

inherit rpm
