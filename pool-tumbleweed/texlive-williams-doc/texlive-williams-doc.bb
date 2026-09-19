SUMMARY = "Documentation for texlive-williams"
DESCRIPTION = "This package includes the documentation for texlive-williams"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-williams-doc-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "9199071eb3499e4a935034b3954804bdb2af83219ec26696417fda32f0cd5e5f6f3cb177deed5dcbd7dd70668b11dc9ef3ba06e80f9862e016bdb6a7d752c75e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-williams-doc"

RDEPENDS:${PN} += ""

inherit rpm
