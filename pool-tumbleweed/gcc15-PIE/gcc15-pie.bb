SUMMARY = "A default configuration to build all binaries in PIE mode"
DESCRIPTION = "This package contains a configuration file (spec) that changes the \
compilers default setting to build all ELF binaries in the Position \
Independend Executable (PIE) variant. This enables better address \
space randomization (ASLR)."
LICENSE = "GPL-3.0-or-later"

PV = "15.3.0+git11272"

RPM_NAME = "gcc15-PIE-15.3.0+git11272-1.4.aarch64.rpm"
RPM_HASH = "94ed16aaa866843fa0f05ec807d5f5907e547941a94e331a81824694ddb95b75d5f91546b400992134f5d391a0304eec900adf371c39ad919864d7e08755fc9b"

RPROVIDES:${PN} += "gcc15-PIE"

RDEPENDS:${PN} += "gcc15"

inherit rpm
