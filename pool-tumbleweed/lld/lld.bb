SUMMARY = "Linker for Clang/LLVM"
DESCRIPTION = "LLD is a linker from the LLVM project. That is a drop-in replacement for \
system linkers and runs much faster than them. It also provides features that \
are useful for toolchain developers."
LICENSE = "Apache-2.0-with-LLVM-exception | NCSA"

PV = "23"

RPM_NAME = "lld-23-1.1.aarch64.rpm"
RPM_HASH = "cd3ce78e70928551ee6dc5ea4dc4a248e314e6aca501153e48a4211f3fe8e35e042ba379d4e37cfe8c042b29d79d9d3e3ca071bd6e390f54ce7773e195a23795"

RPROVIDES:${PN} += "lld"

RDEPENDS:${PN} += "lld23"

inherit rpm
