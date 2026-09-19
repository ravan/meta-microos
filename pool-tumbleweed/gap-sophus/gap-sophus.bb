SUMMARY = "GAP: Computing in nilpotent Lie algebras"
DESCRIPTION = "The Sophus package computes nilpotent Lie algebras over finite prime \
fields. The cover, the list of immediate descendants, and the \
automorphism group of such Lie algebras can be computed and tested \
for whether two such Lie algebras are isomorphic. \
 \
The immediate descendant function of the package can be used to \
classify small-dimensional nilpotent Lie algebras over a given field. \
For instance, the package author obtained a classification of \
nilpotent Lie algebras with dimension at most 9 over F_2."
LICENSE = "GPL-2.0-or-later"

PV = "1.27"

RPM_NAME = "gap-sophus-1.27-1.9.noarch.rpm"
RPM_HASH = "4643a543cb57ad59c154567b90586f5b654eb1b0887e4666b254be21bd498cdd481dfd12ffd7fc59aa959fcbe354e69752ac69dee5318839766cf1ac07d49cb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-sophus"

RDEPENDS:${PN} += "gap-autpgrp \
gap-core"

inherit rpm
