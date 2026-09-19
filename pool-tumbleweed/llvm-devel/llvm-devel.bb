SUMMARY = "Header Files for LLVM"
DESCRIPTION = "This package contains library and header files needed to develop \
new native programs that use the LLVM infrastructure. \
 \
This package is a dummy package that depends on the version of \
llvm-devel that openSUSE currently supports.  Packages that \
don't require a specific LLVM version should depend on this."
LICENSE = "Apache-2.0-with-LLVM-exception | NCSA"

PV = "23"

RPM_NAME = "llvm-devel-23-1.1.aarch64.rpm"
RPM_HASH = "25ad4446c67d9f279fe17ca3c960a20aec0df3f5ab40016c5f8e1bdba50df518fae3631f976b4e01c05e52ea3c82c2a5f590bf29317fc2a8db1c561a3b5315dd"

RPROVIDES:${PN} += "llvm-LTO-devel \
llvm-devel"

RDEPENDS:${PN} += "libomp-devel \
llvm \
llvm-gold \
llvm-polly-devel \
llvm23-devel"

inherit rpm
