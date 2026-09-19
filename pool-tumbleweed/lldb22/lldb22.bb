SUMMARY = "Software debugger built using LLVM libraries"
DESCRIPTION = "LLDB is a next generation, high-performance debugger. It is built as a set \
of reusable components which highly leverage existing libraries in the \
larger LLVM Project, such as the Clang expression parser and LLVM \
disassembler."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "22.1.8"

RPM_NAME = "lldb22-22.1.8-3.2.aarch64.rpm"
RPM_HASH = "02c19a810fac30791c6a337efb0c649be4207cc31afe2a3460be8a95884400e09900ffcac57544023356ebfbcd07e0933dfb10a6277e7f356ffff405b80f25c8"

RPROVIDES:${PN} += "lldb22 \
lldb22-update-alternatives-removed"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libLLVM.so.22.1 \
libLLVMTableGen.so.22.1 \
libc.so.6 \
libclang-cpp.so.22.1 \
libedit.so.0 \
libgcc-s.so.1 \
liblldb.so.22.1 \
libm.so.6 \
libstdc++.so.6 \
libxml2.so.16 \
libz.so.1"

inherit rpm
