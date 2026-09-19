SUMMARY = "LLVM LTO plugin for ld.bfd and ld.gold"
DESCRIPTION = "This package contains a plugin for link-time optimization in binutils linkers. \
 \
Despite the name, it can also be used with ld.bfd. It is required for using \
Clang with -flto=full or -flto=thin when linking with one of those linkers."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "22.1.8"

RPM_NAME = "llvm22-gold-22.1.8-3.2.aarch64.rpm"
RPM_HASH = "d580fc04abde228618f7295aa56e2cd3284130575f06a5e0ff8af6f3a74dd7965a7c2ddb8ee85af591a88955088f9f384280f45ce5b69e5288cf1aadc15aef30"

RPROVIDES:${PN} += "llvm-gold-provider \
llvm22-gold"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLLVM.so.22.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
