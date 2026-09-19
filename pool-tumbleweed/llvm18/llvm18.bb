SUMMARY = "Low Level Virtual Machine"
DESCRIPTION = "LLVM is a compiler infrastructure designed for compile-time, \
link-time, runtime, and idle-time optimization of programs from \
arbitrary programming languages. \
 \
The compiler infrastructure includes mirror sets of programming \
tools as well as libraries with equivalent functionality."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "18.1.8"

RPM_NAME = "llvm18-18.1.8-13.1.aarch64.rpm"
RPM_HASH = "5d7c4fec11ce68f6a42c29bdfd21666e0cbb7e249809f7d837d2a40a40918df173b561739c97fc6e636eb288b9f42eb75da7b13191ca2f66b76cf6bba22723c2"

RPROVIDES:${PN} += "llvm18 \
llvm18-update-alternatives-removed"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libLLVM.so.18.1 \
libLLVMTableGen.so.18.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
