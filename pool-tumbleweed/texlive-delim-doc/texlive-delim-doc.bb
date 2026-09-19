SUMMARY = "Documentation for texlive-delim"
DESCRIPTION = "This package includes the documentation for texlive-delim"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn23974"

RPM_NAME = "texlive-delim-doc-2026.226.1.0svn23974-59.2.noarch.rpm"
RPM_HASH = "7a9a655a25080f52078759c51c071bd3801bbd589c17b0aa13d962de03c9704bcc6ecd199c3122804af9103c2dcfbdf0bd5c57638b9301ffb11d7b7be7b8dad5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-delim-doc"

RDEPENDS:${PN} += ""

inherit rpm
