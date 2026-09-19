SUMMARY = "GAP: Interface to the Atlas of Group Representations"
DESCRIPTION = "AtlasRep provides an interface between GAP and the Atlas of Group \
Representations, a database that comprises representations of many \
almost simple groups and information about their maximal subgroups."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.12"

RPM_NAME = "gap-atlasrep-2.1.12-1.1.noarch.rpm"
RPM_HASH = "25a96cd3569d518d12de3690a03d69f356ea74813baee85ee6a36717642d36be8aff97498d3fdb24a650ffba45a7a34171945be66bd5ae9c7099862f6a538641"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-atlasrep"

RDEPENDS:${PN} += "gap-core \
gap-gapdoc \
gap-utils"

inherit rpm
