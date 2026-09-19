SUMMARY = "GAP: UUIDs for GAP"
DESCRIPTION = "This package provides functionality to create, query, and \
manipulate RFC 4122-style UUIDs within GAP."
LICENSE = "BSD-3-Clause"

PV = "0.7"

RPM_NAME = "gap-uuid-0.7-1.9.noarch.rpm"
RPM_HASH = "7247987f348d0ab09ac6feedc456c10cd75c186f4ff2533010c19a361ddb68b124ba04f691204e71ef9eec0158715779b88b8b8700ca9730ec960c033c234939"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-uuid"

RDEPENDS:${PN} += "gap-core \
gap-gapdoc"

inherit rpm
