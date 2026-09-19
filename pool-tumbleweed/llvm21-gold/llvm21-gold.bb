SUMMARY = "LLVM LTO plugin for ld.bfd and ld.gold"
DESCRIPTION = "This package contains a plugin for link-time optimization in binutils linkers. \
 \
Despite the name, it can also be used with ld.bfd. It is required for using \
Clang with -flto=full or -flto=thin when linking with one of those linkers."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "21.1.8"

RPM_NAME = "llvm21-gold-21.1.8-9.2.aarch64.rpm"
RPM_HASH = "3e21d70fac45bfad76e6dfdbdb0477a20ce4ae1977a25463251dc5d4448bac907dffb02d5920f002624accb7d790774de5448a474b5bb1a8359bae9b5454c180"

RPROVIDES:${PN} += "llvm-gold-provider \
llvm21-gold"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLLVM.so.21.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
