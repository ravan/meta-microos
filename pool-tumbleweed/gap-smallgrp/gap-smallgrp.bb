SUMMARY = "GAP: Small Groups Library"
DESCRIPTION = "The SmallGrp package provides the library of groups of certain \
'small' orders. The groups are sorted by their orders and they are \
listed up to isomorphism; that is, for each of the available orders a \
complete and irredundant list of isomorphism type representatives of \
groups is given."
LICENSE = "Artistic-2.0"

PV = "1.7.0"

RPM_NAME = "gap-smallgrp-1.7.0-1.1.noarch.rpm"
RPM_HASH = "83d00f93cbce55253046c0ff20b83200b884bef9b9080e2e752bdc5ac9f53b62efaabd4e3e8ca1cfb3b3df27fd39f34745645e794ee3a9f098f5cbd3225ce2d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-smallgrp"

RDEPENDS:${PN} += "gap-core"

inherit rpm
