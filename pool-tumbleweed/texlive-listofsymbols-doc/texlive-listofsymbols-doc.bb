SUMMARY = "Documentation for texlive-listofsymbols"
DESCRIPTION = "This package includes the documentation for texlive-listofsymbols"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn16134"

RPM_NAME = "texlive-listofsymbols-doc-2026.226.0.0.2svn16134-61.2.noarch.rpm"
RPM_HASH = "1422ee0ffff14fb8e15e5176dd11cbf651de7b297b064395687fc8acd2bf58ce50c8e3384d91c736d20c5f89ff3133c0d079ebfa9d2110d224dc2df6ca991dc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-listofsymbols-doc"

RDEPENDS:${PN} += ""

inherit rpm
