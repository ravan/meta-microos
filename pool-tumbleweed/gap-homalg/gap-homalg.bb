SUMMARY = "GAP: A homological algebra meta-package for computable Abelian categories"
DESCRIPTION = "The package homalg is the foundational part of the homalg project. It \
provides procedures to construct basic objects in homological \
algebra: \
 \
* filtrations of objects \
* complexes (of objects and of complexes) \
* chain morphisms \
* bicomplexes \
* bigraded (differential) objects \
* spectral sequences \
* functors"
LICENSE = "GPL-2.0-only"

PV = "2025.12.01"

RPM_NAME = "gap-homalg-2025.12.01-1.2.noarch.rpm"
RPM_HASH = "24715ed226bacc57ece338df5f989814a884cb51fb2339045ae7faa7f8fa6f56d274bcd68449296ca1ee5b08361ba05356f86e0e03dc1b5a4f564699bc5b9ead"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-homalg"

RDEPENDS:${PN} += "gap-core \
gap-gapdoc \
gap-toolsforhomalg"

inherit rpm
