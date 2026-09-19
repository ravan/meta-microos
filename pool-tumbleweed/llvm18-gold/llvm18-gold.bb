SUMMARY = "LLVM LTO plugin for ld.bfd and ld.gold"
DESCRIPTION = "This package contains a plugin for link-time optimization in binutils linkers. \
 \
Despite the name, it can also be used with ld.bfd. It is required for using \
Clang with -flto=full or -flto=thin when linking with one of those linkers."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "18.1.8"

RPM_NAME = "llvm18-gold-18.1.8-13.1.aarch64.rpm"
RPM_HASH = "8aaf3051c396fb134e35b42b294d8e3f080341b989c15007b36d662d72a2e5054f99fa0e039e0229c331f5924c4fa575d9c4ac03f75dab37171e65c3016bfb18"

RPROVIDES:${PN} += "llvm-gold-provider \
llvm18-gold"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.18.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
