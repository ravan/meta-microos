SUMMARY = "Software debugger built using LLVM libraries"
DESCRIPTION = "LLDB is a next generation, high-performance debugger. It is built as a set \
of reusable components which highly leverage existing libraries in the \
larger LLVM Project, such as the Clang expression parser and LLVM \
disassembler."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "21.1.8"

RPM_NAME = "lldb21-21.1.8-9.2.aarch64.rpm"
RPM_HASH = "a28d95e4c3c26eddda43c9715a9c99fb5741d196c587cc49c05fcb585a55ae010078044e9e8da38148e35348f9c5e197f75e56d5419f61995dc1e6c9a2b10a82"

RPROVIDES:${PN} += "lldb21 \
lldb21-update-alternatives-removed"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libLLVM.so.21.1 \
libc.so.6 \
libclang-cpp.so.21.1 \
libedit.so.0 \
libgcc-s.so.1 \
liblldb.so.21.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
