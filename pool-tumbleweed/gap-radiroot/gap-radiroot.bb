SUMMARY = "GAP: Roots of a Polynomial as Radicals"
DESCRIPTION = "The package can compute and display an expression by radicals for the \
roots of a solvable, rational polynomial. Related to this it is \
possible to create the Galois group and the splitting field of a \
rational polynomial."
LICENSE = "GPL-2.0-or-later"

PV = "2.10"

RPM_NAME = "gap-radiroot-2.10-1.1.noarch.rpm"
RPM_HASH = "efce432c155bcdf91dfce14075b49429f1896b075d9984fe25828790a1e1bd40daf4f0156b1b6e8fae8c3d40a9754afa12af960066fc5b57bb395f48e1c95398"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-radiroot"

RDEPENDS:${PN} += "gap-alnuth \
gap-core \
gap-transgrp"

inherit rpm
