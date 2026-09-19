SUMMARY = "Linker for Clang/LLVM"
DESCRIPTION = "LLD is a linker from the LLVM project. That is a drop-in replacement for system linkers and runs much faster than them. It also provides features that are useful for toolchain developers."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "22.1.8"

RPM_NAME = "lld22-22.1.8-3.2.aarch64.rpm"
RPM_HASH = "dadc694e2de05dcb35d90bcf4f71e57a2699dd88ba72f7dddfc575d6370c8d4f774a4755e2a6723c18f8c60aa6a244acdd9a3d30925b758949244e4a2be2fa5e"

RPROVIDES:${PN} += "lld22 \
lld22-update-alternatives-removed"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libLLVM.so.22.1 \
libc.so.6 \
libstdc++.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
