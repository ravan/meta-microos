SUMMARY = "Documentation for texlive-rotpages"
DESCRIPTION = "This package includes the documentation for texlive-rotpages"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0svn77682"

RPM_NAME = "texlive-rotpages-doc-2026.226.3.0svn77682-60.2.noarch.rpm"
RPM_HASH = "db91b9eccbdbef03cb7a3e1a60851fbe2e1258d2466a78f250059b3c193ef998c28140fdbb9de3a6b2f189fd0b1f56474a6c00869f0467d5084fcabfee7acd00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rotpages-doc"

RDEPENDS:${PN} += ""

inherit rpm
