SUMMARY = "Low Level Virtual Machine"
DESCRIPTION = "LLVM is a compiler infrastructure designed for compile-time, \
link-time, runtime, and idle-time optimization of programs from \
arbitrary programming languages. \
 \
The compiler infrastructure includes mirror sets of programming \
tools as well as libraries with equivalent functionality."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "23.1.1"

RPM_NAME = "llvm23-23.1.1-1.1.aarch64.rpm"
RPM_HASH = "a36467eb455dd963fea78aac96793e80c9260dc84967bb362d8538bb6e406289940b25df6196c95d531d525e19e447c3005c8b0f0fc0621da64fb614aef971dd"

RPROVIDES:${PN} += "llvm23"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLLVM.so.23.1 \
libLLVMTableGen.so.23.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
