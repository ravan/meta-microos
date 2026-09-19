SUMMARY = "An OpenTTD Music set"
DESCRIPTION = "OpenMSX is a base music set for OpenTTD."
LICENSE = "GPL-2.0-only"

PV = "0.4.2"

RPM_NAME = "openttd-openmsx-0.4.2-3.10.noarch.rpm"
RPM_HASH = "a36d56b964c902b899c9c1b1daa282201393080222de71472df37c5d2e830d87b3ebe0c9a89eeaabca955f501da5854dfb3a4a89d5a5e7022a2af3573c008622"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openttd-openmsx"

RDEPENDS:${PN} += "openttd-data"

inherit rpm
