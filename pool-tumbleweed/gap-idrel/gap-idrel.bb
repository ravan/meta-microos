SUMMARY = "GAP: Identities among relations"
DESCRIPTION = "The IdRel package is designed for computing the identities among \
relations of a group presentation using rewriting, logged rewriting, \
monoid polynomials, module polynomials and Y-sequences."
LICENSE = "GPL-2.0-or-later"

PV = "2.51"

RPM_NAME = "gap-idrel-2.51-1.1.noarch.rpm"
RPM_HASH = "6012057ed1fa08c3f0dc4029fc98edc67383e3c03f2bd5b5c96ed5618396b15eb75dc3f0f906ab967e03bd5b018862372915cc8f00ba320f81a835f599f14c14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-idrel"

RDEPENDS:${PN} += "gap-core"

inherit rpm
