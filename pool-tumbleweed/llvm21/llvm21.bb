SUMMARY = "Low Level Virtual Machine"
DESCRIPTION = "LLVM is a compiler infrastructure designed for compile-time, \
link-time, runtime, and idle-time optimization of programs from \
arbitrary programming languages. \
 \
The compiler infrastructure includes mirror sets of programming \
tools as well as libraries with equivalent functionality."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "21.1.8"

RPM_NAME = "llvm21-21.1.8-9.2.aarch64.rpm"
RPM_HASH = "0355b52260a8c045f0941b24f2303340826170d7c8ce1a8afa015ebe192f938ed4d1953942d32cf58476009f0cef5d76596b21ea1deceb7fbd8d07a475ad95c3"

RPROVIDES:${PN} += "llvm21 \
llvm21-update-alternatives-removed"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libLLVM.so.21.1 \
libLLVMTableGen.so.21.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
