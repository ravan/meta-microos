SUMMARY = "Nordic + Baltic datum grids for Proj"
DESCRIPTION = "Nordic + Baltic datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.8.1"

RPM_NAME = "proj-data-eur-9.8.1-2.3.noarch.rpm"
RPM_HASH = "f4ff96bfb73b471d1dd6527eacd2c2bb5e1fdf3efb6ad471261b949dde0e0d4d0709768dfd890c87ab87118347a355a6ca47e94c99cbe4ee300a191c159ea642"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-eur"

RDEPENDS:${PN} += ""

inherit rpm
