SUMMARY = "Documentation for texlive-tkz-doc"
DESCRIPTION = "This package includes the documentation for texlive-tkz-doc"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.45csvn68665"

RPM_NAME = "texlive-tkz-doc-doc-2026.226.1.45csvn68665-59.2.noarch.rpm"
RPM_HASH = "92516c8fe6e5c93ca13deca6cbdf970b5053a8dc3a822135da0a9020de27b5c9dea4737a344a8c9288c4388f40c433bdfd02b09a4b02af4ca10a16a75350306b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tkz-doc-doc"

RDEPENDS:${PN} += ""

inherit rpm
