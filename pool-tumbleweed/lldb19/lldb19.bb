SUMMARY = "Software debugger built using LLVM libraries"
DESCRIPTION = "LLDB is a next generation, high-performance debugger. It is built as a set \
of reusable components which highly leverage existing libraries in the \
larger LLVM Project, such as the Clang expression parser and LLVM \
disassembler."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "19.1.7"

RPM_NAME = "lldb19-19.1.7-14.3.aarch64.rpm"
RPM_HASH = "da5232a0e7bd5713b967d3b20aa16071f14ef1b4745edcee8d49f5ff17139c4a9957d596437bb90d40a21b0d9f2eee8d5778df1634762439112570f7a5eefcbf"

RPROVIDES:${PN} += "lldb19 \
lldb19-update-alternatives-removed"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libLLVM.so.19.1 \
libc.so.6 \
libclang-cpp.so.19.1 \
libedit.so.0 \
libgcc-s.so.1 \
liblldb.so.19.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
