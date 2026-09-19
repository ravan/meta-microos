SUMMARY = "A default configuration to build all binaries in PIE mode"
DESCRIPTION = "This package contains a configuration file (spec) that changes the \
compilers default setting to build all ELF binaries in the Position \
Independend Executable (PIE) variant. This enables better address \
space randomization (ASLR)."
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0+git9497"

RPM_NAME = "gcc16-PIE-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "533646caa98809eacc5fa783d3ddff0754e49c990ed609b2dc9db1cbcbea4a9357d26f0dcfc78e4cef189c1e8e2d7a250b8cd2e09b8750d954e25f116f02f0d4"

RPROVIDES:${PN} += "gcc16-PIE"

RDEPENDS:${PN} += "gcc16"

inherit rpm
