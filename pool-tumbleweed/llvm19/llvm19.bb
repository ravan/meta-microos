SUMMARY = "Low Level Virtual Machine"
DESCRIPTION = "LLVM is a compiler infrastructure designed for compile-time, \
link-time, runtime, and idle-time optimization of programs from \
arbitrary programming languages. \
 \
The compiler infrastructure includes mirror sets of programming \
tools as well as libraries with equivalent functionality."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "19.1.7"

RPM_NAME = "llvm19-19.1.7-14.3.aarch64.rpm"
RPM_HASH = "cbf2789e77fce0f3405a43ac990b6c02dfe38d9ce4a3559cbd6fdaf02a780f0b60475104e92145a012d56c7d82cddb0e13fe1383a81008c43c607b48664a676a"

RPROVIDES:${PN} += "llvm19 \
llvm19-update-alternatives-removed"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libLLVM.so.19.1 \
libLLVMTableGen.so.19.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
