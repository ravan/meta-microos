SUMMARY = "A default configuration to build all binaries in PIE mode"
DESCRIPTION = "This package contains a configuration file (spec) that changes the \
compilers default setting to build all ELF binaries in the Position \
Independend Executable (PIE) variant. This enables better address \
space randomization (ASLR)."
LICENSE = "GPL-3.0-or-later"

PV = "16"

RPM_NAME = "gcc-PIE-16-1.1.aarch64.rpm"
RPM_HASH = "7b9e299caa110000d8191fcd09875f42758d20be54463b90b0d316c5f25f6068d2f4d4cb8d78eeddc75b072f09fed4aa1bbafc863519bc40e0bf413ca0f8eb3a"

RPROVIDES:${PN} += "gcc-PIE"

RDEPENDS:${PN} += "gcc16-PIE"

inherit rpm
