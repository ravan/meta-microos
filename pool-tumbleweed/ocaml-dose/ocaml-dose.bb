SUMMARY = "An OCaml dependency toolkit"
DESCRIPTION = "Dose3 is a framework made of several OCaml libraries for managing distribution \
packages and their dependencies. \
 \
Though not tied to any particular distribution, dose3 constitutes a pool of \
libraries which enable analyzing packages coming from various distributions. \
 \
Besides basic functionalities for querying and setting package properties, \
dose3 also implements algorithms for solving more complex problems (monitoring \
package evolutions, correct and complete dependency resolution, repository-wide \
uninstallability checks)."
LICENSE = "LGPL-3.0-or-later"

PV = "7.0.0"

RPM_NAME = "ocaml-dose-7.0.0-5.1.aarch64.rpm"
RPM_HASH = "b55ae8a5eb6a3a150d0ec5ae277e0497cdcf4262193455e8e05528dd0d68a647e808ca50a44c75286d4eda2337a2b4d659d47ea6bbb6468e7e2319dfb783b2bb"

RPROVIDES:${PN} += "ocaml-dose"

RDEPENDS:${PN} += ""

inherit rpm
