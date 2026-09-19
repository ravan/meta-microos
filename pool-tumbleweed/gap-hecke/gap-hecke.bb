SUMMARY = "GAP: Hecke - Specht 2.4 ported to GAP 4"
DESCRIPTION = "The Hecke package provides functions for calculating decomposition \
matrices of Hecke algebras of the symmetric groups and q-Schur \
algebras."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.0"

RPM_NAME = "gap-hecke-1.6.0-1.1.noarch.rpm"
RPM_HASH = "abc7ecd232729f2b8714a5ec341133c6ce6e46f3c1a362b16fd5284285a353632bd188f794ee259c30d7a02d0174deb1736f9ce6a04c1327cfba37ab6367713a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-hecke"

RDEPENDS:${PN} += "/usr/bin/bash \
gap-core"

inherit rpm
