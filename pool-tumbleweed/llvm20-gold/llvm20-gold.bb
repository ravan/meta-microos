SUMMARY = "LLVM LTO plugin for ld.bfd and ld.gold"
DESCRIPTION = "This package contains a plugin for link-time optimization in binutils linkers. \
 \
Despite the name, it can also be used with ld.bfd. It is required for using \
Clang with -flto=full or -flto=thin when linking with one of those linkers."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "20.1.8"

RPM_NAME = "llvm20-gold-20.1.8-8.2.aarch64.rpm"
RPM_HASH = "a497d1e46561d779238b27bf27025fbb9a49fbddfb4f359a0a58117c0ac5fa44c0f113bfcbb9fa3c10aaf4481d138002fdbc43c07594cd006b6a92547b1a367c"

RPROVIDES:${PN} += "llvm-gold-provider \
llvm20-gold"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.20.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
