SUMMARY = "Bash completion for Gromacs"
DESCRIPTION = "GROMACS is a package to perform molecular dynamics computer \
simulations. \
 \
This package contains bash completion support for gromacs."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later & BSD-3-Clause"

PV = "2026.1"

RPM_NAME = "gromacs-bash-completion-2026.1-2.1.noarch.rpm"
RPM_HASH = "c781cc8c140ac8b29a556e74d125e35a361c65c75840f2f7f9d83937ce493c47222c73e38a0a360dab65eb3d064663e396aa92e324cb7b6d5966b6ebf6d828dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gromacs-bash \
gromacs-bash-completion"

RDEPENDS:${PN} += ""

inherit rpm
