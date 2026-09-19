SUMMARY = "Gold linker plugin for LLVM"
DESCRIPTION = "This package contains the Gold linker plugin for LLVM. \
 \
This package is a dummy package that depends on the version of \
llvm-gold that openSUSE currently supports.  Packages that \
don't require a specific LLVM version should depend on this."
LICENSE = "Apache-2.0-with-LLVM-exception | NCSA"

PV = "23"

RPM_NAME = "llvm-gold-23-1.1.aarch64.rpm"
RPM_HASH = "0824d7ea7c08c9c175e2a0192b8e43dae8f532d46841aae30d1d56743813d4c1b2a8822eae503433aceda6929069880a880cad62fc35d6b78019c22f6cd8e2cf"

RPROVIDES:${PN} += "llvm-gold"

RDEPENDS:${PN} += "llvm23-gold"

inherit rpm
