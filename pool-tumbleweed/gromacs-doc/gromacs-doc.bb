SUMMARY = "Documentation for Gromacs"
DESCRIPTION = "GROMACS is a package to perform molecular dynamics computer \
simulations. \
 \
This package contains documentation for gromacs."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later & BSD-3-Clause"

PV = "2026.1"

RPM_NAME = "gromacs-doc-2026.1-2.1.noarch.rpm"
RPM_HASH = "280b4281a5acefc454e177784047d68468fa51a9dfcd38a57d26d399fbe837779d4c277d34b4253f4e0d9ddb229d821e4b4ca6c69e66c4548f2e69e668cde11f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gromacs-doc"

RDEPENDS:${PN} += ""

inherit rpm
