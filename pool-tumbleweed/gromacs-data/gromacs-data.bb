SUMMARY = "Data files for Gromacs"
DESCRIPTION = "GROMACS is a package to perform molecular dynamics computer \
simulations. \
 \
This package contains data files for gromacs."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later & BSD-3-Clause"

PV = "2026.1"

RPM_NAME = "gromacs-data-2026.1-2.1.noarch.rpm"
RPM_HASH = "7f5b04ff3244a473d2357eff1558b31a006ae276650bd926a90c48685569beb8b74d22ceaccb83dfe64c48807f32b27a638e4246c46b6084fb2fb45b433c15cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gromacs-/usr/share/gromacs/README.tutor \
gromacs-data"

RDEPENDS:${PN} += ""

inherit rpm
