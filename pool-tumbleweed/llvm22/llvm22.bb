SUMMARY = "Low Level Virtual Machine"
DESCRIPTION = "LLVM is a compiler infrastructure designed for compile-time, \
link-time, runtime, and idle-time optimization of programs from \
arbitrary programming languages. \
 \
The compiler infrastructure includes mirror sets of programming \
tools as well as libraries with equivalent functionality."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "22.1.8"

RPM_NAME = "llvm22-22.1.8-3.2.aarch64.rpm"
RPM_HASH = "82f537b8013a04962762fcea1ba1ee70a94dbce335f8de1741fdb21b7d920f3a29b3fb6a6dd8b0f8211e96c15cd75511f12097c5e22520244529d6be1289b57c"

RPROVIDES:${PN} += "llvm22 \
llvm22-update-alternatives-removed"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libLLVM.so.22.1 \
libLLVMTableGen.so.22.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
