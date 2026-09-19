SUMMARY = "LLVM LTO plugin for ld.bfd and ld.gold"
DESCRIPTION = "This package contains a plugin for link-time optimization in binutils linkers. \
 \
Despite the name, it can also be used with ld.bfd. It is required for using \
Clang with -flto=full or -flto=thin when linking with one of those linkers."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "23.1.1"

RPM_NAME = "llvm23-gold-23.1.1-1.1.aarch64.rpm"
RPM_HASH = "d444b8328856bb4b779772831175cc119722f18e9f2d0e3c607b84b8e98d4dedc6c842b409bc173dfb98d9dbdb39232e84433c8c2dac1405868167bacd5e7534"

RPROVIDES:${PN} += "llvm-gold-provider \
llvm23-gold"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLLVM.so.23.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
