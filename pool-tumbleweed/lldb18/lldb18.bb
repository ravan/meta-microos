SUMMARY = "Software debugger built using LLVM libraries"
DESCRIPTION = "LLDB is a next generation, high-performance debugger. It is built as a set \
of reusable components which highly leverage existing libraries in the \
larger LLVM Project, such as the Clang expression parser and LLVM \
disassembler."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "18.1.8"

RPM_NAME = "lldb18-18.1.8-13.1.aarch64.rpm"
RPM_HASH = "327387c4617b10270b0d57c950c9cbf2f7e460485d62a85320aa228085e08117e46526204c5b16f3cd622d9b3120637261b87fabe47e377519c5a3c01b63ad7e"

RPROVIDES:${PN} += "lldb18 \
lldb18-update-alternatives-removed"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libLLVM.so.18.1 \
libc.so.6 \
libclang-cpp.so.18.1 \
libedit.so.0 \
libgcc-s.so.1 \
liblldb.so.18.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
