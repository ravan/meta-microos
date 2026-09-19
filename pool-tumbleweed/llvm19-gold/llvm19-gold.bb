SUMMARY = "LLVM LTO plugin for ld.bfd and ld.gold"
DESCRIPTION = "This package contains a plugin for link-time optimization in binutils linkers. \
 \
Despite the name, it can also be used with ld.bfd. It is required for using \
Clang with -flto=full or -flto=thin when linking with one of those linkers."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "19.1.7"

RPM_NAME = "llvm19-gold-19.1.7-14.3.aarch64.rpm"
RPM_HASH = "6da058018ae5b5b46d2aa6207fcd62957a804bec1bbdc99adea8cd629d6583e23a6c47b5953ad36a3b3dba0a048b3e6272db6e186c2cbfb583e2ca914724086b"

RPROVIDES:${PN} += "llvm-gold-provider \
llvm19-gold"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.19.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
