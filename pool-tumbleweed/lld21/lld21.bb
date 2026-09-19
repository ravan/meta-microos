SUMMARY = "Linker for Clang/LLVM"
DESCRIPTION = "LLD is a linker from the LLVM project. That is a drop-in replacement for system linkers and runs much faster than them. It also provides features that are useful for toolchain developers."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "21.1.8"

RPM_NAME = "lld21-21.1.8-9.2.aarch64.rpm"
RPM_HASH = "6a9f72d671df891d90628b0b5bed1d326ab56f1cc1fcb1b7810328dffa0782d95c67d2a97c7ff03b8d0a4d6a13373cfec9b3710aad8cf1c9e146f270ca12ba53"

RPROVIDES:${PN} += "lld21 \
lld21-update-alternatives-removed"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libLLVM.so.21.1 \
libc.so.6 \
libstdc++.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
