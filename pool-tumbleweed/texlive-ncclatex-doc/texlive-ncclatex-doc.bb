SUMMARY = "Documentation for texlive-ncclatex"
DESCRIPTION = "This package includes the documentation for texlive-ncclatex"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn15878"

RPM_NAME = "texlive-ncclatex-doc-2026.226.1.5svn15878-61.2.noarch.rpm"
RPM_HASH = "1cd3ee39ad1e2a8e7cac6225c38a449aaf57212250e909bae2a65b68ab5d3a8778c9e01f3337dda69f060c35c8de5891ecb524cfc4db371babc2b42b8d430a5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ncclatex-doc-ru \
texlive-ncclatex-doc"

RDEPENDS:${PN} += ""

inherit rpm
