SUMMARY = "Documentation for texlive-stackengine"
DESCRIPTION = "This package includes the documentation for texlive-stackengine"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.11svn75878"

RPM_NAME = "texlive-stackengine-doc-2026.226.4.11svn75878-64.2.noarch.rpm"
RPM_HASH = "d5e3be3923556076d37436fa08a9eadccdc33af0eed3f55c3aba690961f6383e933d0853d811f7596811bfc00511763f7fc4fe3d7d9fa40704ad2e2ce8da9441"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stackengine-doc"

RDEPENDS:${PN} += ""

inherit rpm
