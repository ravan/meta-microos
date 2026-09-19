SUMMARY = "Brasil datum grids for Proj"
DESCRIPTION = "Brasil datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.8.1"

RPM_NAME = "proj-data-br-9.8.1-2.3.noarch.rpm"
RPM_HASH = "300c3424638461677f73ef4086def2e69b0129c700ffae57e7b1f136fe1df0b11cd0cebde363dc2bad099e34e905741589ff7e3926e5af4d9ce6d9046ed25df9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-br"

RDEPENDS:${PN} += ""

inherit rpm
