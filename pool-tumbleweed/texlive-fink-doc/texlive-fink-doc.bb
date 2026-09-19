SUMMARY = "Documentation for texlive-fink"
DESCRIPTION = "This package includes the documentation for texlive-fink"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2.1svn24329"

RPM_NAME = "texlive-fink-doc-2026.226.2.2.1svn24329-59.2.noarch.rpm"
RPM_HASH = "0906cc428006c88bb1ff32e452796762bfde977f3af5ad2511046a46e50ed9326279d755eb088a657c4e6d1d4ecf799ac8f9fa3cb85025d512677e4c53f8af2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fink-doc"

RDEPENDS:${PN} += ""

inherit rpm
