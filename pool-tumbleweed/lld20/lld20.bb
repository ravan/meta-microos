SUMMARY = "Linker for Clang/LLVM"
DESCRIPTION = "LLD is a linker from the LLVM project. That is a drop-in replacement for system linkers and runs much faster than them. It also provides features that are useful for toolchain developers."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "20.1.8"

RPM_NAME = "lld20-20.1.8-8.2.aarch64.rpm"
RPM_HASH = "4940d47103bf0ad24ac88449ba3482afca247c362f2d24d8f1393292d8d20a03d31eb694363dbfca43944e99cecd47a08f371c0e100ce3fb323dc984feaa17fd"

RPROVIDES:${PN} += "lld20 \
lld20-update-alternatives-removed"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libLLVM.so.20.1 \
libc.so.6 \
libstdc++.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
