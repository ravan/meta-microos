SUMMARY = "Documentation for texlive-resumemac"
DESCRIPTION = "This package includes the documentation for texlive-resumemac"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-resumemac-doc-2026.226.svn15878-60.4.noarch.rpm"
RPM_HASH = "1b9fbfa08a166ffe3d651b8dab777d62392fb5d76748f0ff62524f51e07a8e8085c2df43028d9fb75fd50c0cc2b27b071487f718074975d09ce7ebe047bd427b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-resumemac-doc"

RDEPENDS:${PN} += ""

inherit rpm
