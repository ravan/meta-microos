SUMMARY = "GAP: Library of normalized unit groups of modular group algebras"
DESCRIPTION = "The UnitLib package extends the LAGUNA package and provides the \
library of normalized unit groups of modular group algebras of all \
finite p-groups of order not greater than 243 over the field of p \
elements."
LICENSE = "GPL-2.0-or-later"

PV = "5.1.0"

RPM_NAME = "gap-unitlib-5.1.0-1.1.noarch.rpm"
RPM_HASH = "cd5c860c9f5ae0d33aee471d521f00c4281fedc00209b0f704c8c4340a4ae8ba8e04a1670c5474bb4550003c8af2e7cb5e88b5015f38c32214a631b2dd3b123a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-unitlib"

RDEPENDS:${PN} += "gap-core \
gap-laguna \
gap-smallgrp \
gzip"

inherit rpm
