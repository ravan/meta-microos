SUMMARY = "GAP: Computation with twisted conjugacy classes"
DESCRIPTION = "The TwistedConjugacy package provides methods for solving the twisted \
conjugacy problem (including the 'search' and 'multiple' variants) \
and for computing Reidemeister classes, numbers, spectra, and zeta \
functions. It also includes utility functions for working with \
(double) cosets, group homomorphisms, and group derivations. \
 \
These methods are primarily designed for use with finite groups and \
with PcpGroups (finite or infinite) provided by the Polycyclic \
package."
LICENSE = "GPL-2.0-or-later"

PV = "3.4.2"

RPM_NAME = "gap-twistedconjugacy-3.4.2-1.1.noarch.rpm"
RPM_HASH = "263a18a3878c435ae852fc25635ecb1ff79ae1c081cae7a7b8da3d070811f3253ee17b96aa3fa5d4a9488ac74388ad98f1f6f687eec95d20de23c003563c61fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-twistedconjugacy"

RDEPENDS:${PN} += "gap-autpgrp \
gap-core \
gap-polycyclic"

inherit rpm
