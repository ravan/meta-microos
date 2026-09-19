SUMMARY = "Data needed by libKSysGuardSystemStats"
DESCRIPTION = "Contains the unversioned D-Bus interface definition for KSystemStats plugins."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "ksysguardsystemstats6-data-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "637afd0d581c2f954d08f20f358770fae9e32e236dcc6add53bae2a8cffb91b107b7a136b3cc2e3691437f04c2ee5f289b1b1c29e873ee1d3f42f7150501b4e1"

RPROVIDES:${PN} += "ksysguardsystemstats-data \
ksysguardsystemstats6-data"

RDEPENDS:${PN} += ""

inherit rpm
