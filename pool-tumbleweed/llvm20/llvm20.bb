SUMMARY = "Low Level Virtual Machine"
DESCRIPTION = "LLVM is a compiler infrastructure designed for compile-time, \
link-time, runtime, and idle-time optimization of programs from \
arbitrary programming languages. \
 \
The compiler infrastructure includes mirror sets of programming \
tools as well as libraries with equivalent functionality."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "20.1.8"

RPM_NAME = "llvm20-20.1.8-8.2.aarch64.rpm"
RPM_HASH = "59c812cbb9df98560efbe64aea483e3c4a92b396587957efa05df1639cda9e6b8d15a8e3808c01ac67b8462a9d402eedb824808dcbf4303eede9c36a34e82d5c"

RPROVIDES:${PN} += "llvm20 \
llvm20-update-alternatives-removed"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libLLVM.so.20.1 \
libLLVMTableGen.so.20.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
