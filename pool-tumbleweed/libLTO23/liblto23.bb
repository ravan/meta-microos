SUMMARY = "Link-time optimizer for LLVM"
DESCRIPTION = "This package contains the link-time optimizer for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "23.1.1"

RPM_NAME = "libLTO23-23.1.1-1.1.aarch64.rpm"
RPM_HASH = "a6b968bebcef422c6d1572d6af8221b240e1e574f025a77025eff3b767cb2890f87103cfec04ab4ec78b674515dbb444b6ae717915a91821342043abe55e8f48"

RPROVIDES:${PN} += "libLTO.so.23.1 \
libLTO23"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.23.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
