SUMMARY = "Linker for Clang/LLVM"
DESCRIPTION = "LLD is a linker from the LLVM project. That is a drop-in replacement for system linkers and runs much faster than them. It also provides features that are useful for toolchain developers."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "23.1.1"

RPM_NAME = "lld23-23.1.1-1.1.aarch64.rpm"
RPM_HASH = "79bebdb6370ef33aa60ed5a483ccb26c27746117a37542a06b6b6fc1a90afe382f75fba33f7d3e9cc9f7b6fa3b057572ec42f74115d9b64cb8726e7b900a0771"

RPROVIDES:${PN} += "lld23"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLLVM.so.23.1 \
libc.so.6 \
libstdc++.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
