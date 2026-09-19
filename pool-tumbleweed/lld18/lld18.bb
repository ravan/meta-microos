SUMMARY = "Linker for Clang/LLVM"
DESCRIPTION = "LLD is a linker from the LLVM project. That is a drop-in replacement for system linkers and runs much faster than them. It also provides features that are useful for toolchain developers."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "18.1.8"

RPM_NAME = "lld18-18.1.8-13.1.aarch64.rpm"
RPM_HASH = "2ff9546065b38d75c0ec7a58c0f35b51c2ce8faa2fc1364409e2ae4bd3ec9923f6a73fdfb9bb7c86a81857854bfd035ba2a77ad37764d06e3d7a1ce9ea918d3e"

RPROVIDES:${PN} += "lld18 \
lld18-update-alternatives-removed"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libLLVM.so.18.1 \
libc.so.6 \
libstdc++.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
