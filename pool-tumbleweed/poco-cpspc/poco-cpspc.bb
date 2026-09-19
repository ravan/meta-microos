SUMMARY = "POCO C++ Server Page Compiler"
DESCRIPTION = "This program compiles web pages containing embedded C++ code into a C++ class \
that can be used with the HTTP server from the POCO Net library."
LICENSE = "BSL-1.0"

PV = "1.15.3"

RPM_NAME = "poco-cpspc-1.15.3-1.3.aarch64.rpm"
RPM_HASH = "91e56f04bb577f21079b5bab5061bca261eadb6f7db014e8d40eeeccbcc6d7b1cbb5e2aa59ce199c82000e6ac44170bcf6abd847f8db41db3a3523fe26fe9bae"

RPROVIDES:${PN} += "poco-cpspc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libPocoFoundation.so.123 \
libPocoNet.so.123 \
libPocoUtil.so.123 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
