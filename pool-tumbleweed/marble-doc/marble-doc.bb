SUMMARY = "Marble documentation"
DESCRIPTION = "Marble is a viewer of map data. This package contains its documentation."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "marble-doc-26.08.1-1.2.noarch.rpm"
RPM_HASH = "b6cffc689e55c410d477160579b645c7d0ba6f76602faf9a32c55b37a2176c73a6f5606fb2ca774d65281194a6055cd26923de8cda88e0b60eb79a8c1215093e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "marble-doc \
marble5-doc"

RDEPENDS:${PN} += "marble"

inherit rpm
