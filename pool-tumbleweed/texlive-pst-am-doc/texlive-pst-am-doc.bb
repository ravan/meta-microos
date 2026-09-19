SUMMARY = "Documentation for texlive-pst-am"
DESCRIPTION = "This package includes the documentation for texlive-pst-am"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.02svn19591"

RPM_NAME = "texlive-pst-am-doc-2026.226.1.02svn19591-59.2.noarch.rpm"
RPM_HASH = "8eadb93af65108c041ba463290dad65069a4ce45234c2f7d46d4fa6b51f700bd791aeb82f88dc72ea26b9de05920005149e79b645bd2c4facbde539c44aca5eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-am-doc"

RDEPENDS:${PN} += ""

inherit rpm
