SUMMARY = "Documentation for texlive-figput"
DESCRIPTION = "This package includes the documentation for texlive-figput"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.90svn76924"

RPM_NAME = "texlive-figput-doc-2026.226.0.0.90svn76924-59.2.noarch.rpm"
RPM_HASH = "47976bde37863225139fa641f3f87eecd0e25f15a15704c5609bf422e44f8b0989741d24df786f686e3867cdf6e630a58576ad32ec9fc7f7a1e1a3fcd05f0a27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-figput-doc"

RDEPENDS:${PN} += ""

inherit rpm
