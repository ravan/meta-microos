SUMMARY = "Link-time optimizer for LLVM"
DESCRIPTION = "This package contains the link-time optimizer for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "19.1.7"

RPM_NAME = "libLTO19-19.1.7-14.3.aarch64.rpm"
RPM_HASH = "7ed63bc4ba4e9bb09493f6a9beee0ced5f17e5f428177778676dacd0563713947ae2518687e6160037cde7f1855239e83cc64b7c34fbf6a5ff837b48dc1552f3"

RPROVIDES:${PN} += "libLTO.so.19.1 \
libLTO19"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.19.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
