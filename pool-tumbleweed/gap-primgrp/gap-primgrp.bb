SUMMARY = "GAP: Primitive Permutation Groups Library"
DESCRIPTION = "The PrimGrp package provides the library of primitive permutation \
groups which includes, up to permutation isomorphism (i.e., up to \
conjugacy in the corresponding symmetric group), all primitive \
permutation groups of degree < 4096."
LICENSE = "GPL-2.0-or-later"

PV = "4.0.3"

RPM_NAME = "gap-primgrp-4.0.3-1.1.noarch.rpm"
RPM_HASH = "42e9be2120325760cbf2ac3fff73898fed6eebe631bcc1849523d6538e60e637003695a2c808cff586318f42d11c8abb22a1f450892c7e47d326df1f33e189c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-primgrp"

RDEPENDS:${PN} += "gap-core \
gap-gapdoc"

inherit rpm
