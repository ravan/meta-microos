SUMMARY = "Documentation for texlive-chemcompounds"
DESCRIPTION = "This package includes the documentation for texlive-chemcompounds"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-chemcompounds-doc-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "3e8e437a67ba08817a976b45f2b85f910d8f177c9d4ff88da46fbbf1e60e2fae12d7ea8eb8b27c128408102c8c8a4cc35b8726bbfff068b96a58a3596b6e5a9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chemcompounds-doc"

RDEPENDS:${PN} += ""

inherit rpm
