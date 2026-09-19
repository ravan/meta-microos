SUMMARY = "Linker for Clang/LLVM"
DESCRIPTION = "LLD is a linker from the LLVM project. That is a drop-in replacement for system linkers and runs much faster than them. It also provides features that are useful for toolchain developers."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "19.1.7"

RPM_NAME = "lld19-19.1.7-14.3.aarch64.rpm"
RPM_HASH = "eb9a25078cad81d4c26c86977feb3858c7633ebe67ef8993fc8a6c3db02ba228db43cf16fe542f5c58fbbb43896fe13066c2d10f911ada4b964fb5cf7176e471"

RPROVIDES:${PN} += "lld19 \
lld19-update-alternatives-removed"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libLLVM.so.19.1 \
libc.so.6 \
libstdc++.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
