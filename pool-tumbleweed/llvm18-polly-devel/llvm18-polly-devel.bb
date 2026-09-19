SUMMARY = "Development files for Polly"
DESCRIPTION = "This package contains the development files for Polly."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "18.1.8"

RPM_NAME = "llvm18-polly-devel-18.1.8-13.1.aarch64.rpm"
RPM_HASH = "42843328c3e1065202d478c05e2eba94aedc085a30c2dd223f0203add62256abe35b40f0441df543fdc2b3acfdf670f6ca2fc76b4db7319f3f9c90166dad161f"

RPROVIDES:${PN} += "cmake-Polly \
llvm-polly-devel-provider \
llvm18-polly-devel"

RDEPENDS:${PN} += "/sbin/ldconfig \
llvm18-devel \
llvm18-polly"

inherit rpm
