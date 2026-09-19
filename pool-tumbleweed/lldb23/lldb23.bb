SUMMARY = "Software debugger built using LLVM libraries"
DESCRIPTION = "LLDB is a next generation, high-performance debugger. It is built as a set \
of reusable components which highly leverage existing libraries in the \
larger LLVM Project, such as the Clang expression parser and LLVM \
disassembler."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "23.1.1"

RPM_NAME = "lldb23-23.1.1-1.1.aarch64.rpm"
RPM_HASH = "675bae5221c295d9e2df903d55a6a116d3a86526aaae9cdfab1a90755effc561cb2f07fd35b19abedabd2b68e7ac356a8a437da3fb7faf63c89182636da2f831"

RPROVIDES:${PN} += "lldb23"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLLVM.so.23.1 \
libLLVMTableGen.so.23.1 \
libc.so.6 \
libclang-cpp.so.23.1 \
libedit.so.0 \
libgcc-s.so.1 \
liblldb.so.23.1 \
libm.so.6 \
libstdc++.so.6 \
libxml2.so.16 \
libz.so.1"

inherit rpm
