SUMMARY = "A default configuration to build all binaries in PIE mode"
DESCRIPTION = "This package contains a configuration file (spec) that changes the \
compilers default setting to build all ELF binaries in the Position \
Independend Executable (PIE) variant. This enables better address \
space randomization (ASLR)."
LICENSE = "GPL-3.0-or-later"

PV = "14.4.0+git12698"

RPM_NAME = "gcc14-PIE-14.4.0+git12698-1.4.aarch64.rpm"
RPM_HASH = "79cd494e2fdbfa57235fdb4aba898e19bd69cb3e944f82fecbe4a06959a7c609bf86fe5c3ef22a6ad54b0011925f5e04143ecece85415a56b94bf549df5e7c86"

RPROVIDES:${PN} += "gcc14-PIE"

RDEPENDS:${PN} += "gcc14"

inherit rpm
