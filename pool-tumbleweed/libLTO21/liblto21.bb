SUMMARY = "Link-time optimizer for LLVM"
DESCRIPTION = "This package contains the link-time optimizer for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "21.1.8"

RPM_NAME = "libLTO21-21.1.8-9.2.aarch64.rpm"
RPM_HASH = "4fed992beaf765b78360ec784122ddfbb9351b7839b6ced20438f5f729b0c141242ba16370b500f3fd1216aa310c1471455c8b303c066ccce1a04ece4800aded"

RPROVIDES:${PN} += "libLTO.so.21.1 \
libLTO21"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.21.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
