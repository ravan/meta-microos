SUMMARY = "Low Level Virtual Machine"
DESCRIPTION = "LLVM is a compiler infrastructure designed for compile-time, \
link-time, runtime, and idle-time optimization of programs from \
arbitrary programming languages. \
 \
The compiler infrastructure includes mirror sets of programming \
tools as well as libraries with equivalent functionality. \
 \
This package is a dummy package that depends on the version of \
llvm that openSUSE currently supports.  Packages that \
don't require a specific LLVM version should depend on this."
LICENSE = "Apache-2.0-with-LLVM-exception | NCSA"

PV = "23"

RPM_NAME = "llvm-23-1.1.aarch64.rpm"
RPM_HASH = "ba1ffa5b384555fc5b300dd51f08102d2486fc2d70d464e509ec7e0d16c1041f0ece5c3512f6186cdf5115a68661416495061bb7dec64b9960a8feed06112aae"

RPROVIDES:${PN} += "llvm"

RDEPENDS:${PN} += "llvm23"

inherit rpm
