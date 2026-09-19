SUMMARY = "Fish Completion for krelay"
DESCRIPTION = "Fish command line completion support for krelay."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "krelay-fish-completion-0.2.0-1.4.noarch.rpm"
RPM_HASH = "83316a5fdc1f4127bf3865ac2c3d11461aa8949a2fe970dae04791ceb158ed8d13e03b7ea989c6f044ede9d3a2a0b307fe1e31d93ddf3c8b782c293dec50d6f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "krelay-fish-completion"

RDEPENDS:${PN} += "fish \
krelay"

inherit rpm
