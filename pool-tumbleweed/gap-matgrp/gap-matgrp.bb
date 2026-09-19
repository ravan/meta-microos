SUMMARY = "GAP: Matric group interface routines"
DESCRIPTION = "The matgrp package provides an interface to the solvable radical \
functionality for matrix groups, building on constructive \
recognition."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "0.73"

RPM_NAME = "gap-matgrp-0.73-1.2.noarch.rpm"
RPM_HASH = "66dc7a1907ac0d5f6e829bb373bcd98385c00fb91f221b5c1690a59f8b1cf470eb6c91262b656779c052030bf3694f931cd4fabbf6eb7dde586f52070a6d9958"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-matgrp"

RDEPENDS:${PN} += "gap-atlasrep \
gap-core \
gap-forms \
gap-genss \
gap-orb \
gap-recog"

inherit rpm
