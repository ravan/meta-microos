SUMMARY = "A default configuration to build all binaries in PIE mode"
DESCRIPTION = "This package contains a configuration file (spec) that changes the \
compilers default setting to build all ELF binaries in the Position \
Independend Executable (PIE) variant. This enables better address \
space randomization (ASLR)."
LICENSE = "GPL-3.0-or-later"

PV = "13.5.0+git10516"

RPM_NAME = "gcc13-PIE-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "d3c4f197189e9adcb5e7d412c08cdab57d1b461533fbd69e16ce22dd940f163b2e112fabd2242773fde32fa172c4793e62fd095a3f559a933e3820318eb7c767"

RPROVIDES:${PN} += "gcc13-PIE"

RDEPENDS:${PN} += "gcc13"

inherit rpm
