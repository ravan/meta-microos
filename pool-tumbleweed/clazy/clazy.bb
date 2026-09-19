SUMMARY = "Qt oriented code checker based on the Clang framework"
DESCRIPTION = "clazy is a compiler plugin which allows Clang to understand Qt semantics. \
You get more than 50 Qt related compiler warnings, ranging from unneeded memory \
allocations to misusage of API, including fix-its for automatic refactoring."
LICENSE = "LGPL-2.0-or-later"

PV = "1.17.1"

RPM_NAME = "clazy-1.17.1-1.13.aarch64.rpm"
RPM_HASH = "393398eed12867f6e71e5153cb84962b61b0a4252156863b99ac089ef0b6d1c8f8bd81f792f16afb90ee987418d2fb65bfa75e8cdb904ef4efa246559aaecd6b"

RPROVIDES:${PN} += "clazy"

RDEPENDS:${PN} += "/usr/bin/sh \
clang \
ld-linux-aarch64.so.1 \
libLLVM.so.23.1 \
libLLVM23 \
libc.so.6 \
libclang-cpp.so.23.1 \
libclang-cpp23 \
libclang13 \
libstdc++.so.6"

inherit rpm
