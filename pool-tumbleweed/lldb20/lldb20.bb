SUMMARY = "Software debugger built using LLVM libraries"
DESCRIPTION = "LLDB is a next generation, high-performance debugger. It is built as a set \
of reusable components which highly leverage existing libraries in the \
larger LLVM Project, such as the Clang expression parser and LLVM \
disassembler."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "20.1.8"

RPM_NAME = "lldb20-20.1.8-8.2.aarch64.rpm"
RPM_HASH = "7a71b3f3689e761ec655eed5acdc4dfd49a86be425b0eb9e52685261df4306465c9ba9ecadc7dbf7ca5d98aee993a7618a333495f9779524de06d45e355eb713"

RPROVIDES:${PN} += "lldb20 \
lldb20-update-alternatives-removed"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libLLVM.so.20.1 \
libc.so.6 \
libclang-cpp.so.20.1 \
libedit.so.0 \
libgcc-s.so.1 \
liblldb.so.20.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
