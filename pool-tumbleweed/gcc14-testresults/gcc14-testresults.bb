SUMMARY = "Testsuite results"
DESCRIPTION = "Results from running the gcc and target library testsuites."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "14.4.0+git12698"

RPM_NAME = "gcc14-testresults-14.4.0+git12698-1.4.aarch64.rpm"
RPM_HASH = "a570e2f745df411808276af52e2917186cb0105b0224fe49406b71c79d359ea0e04ae09b025634f6b91954b4ccae8f6985b6a4b907d9110f6afec3adf070ef8e"

RPROVIDES:${PN} += "gcc14-testresults"

RDEPENDS:${PN} += ""

inherit rpm
