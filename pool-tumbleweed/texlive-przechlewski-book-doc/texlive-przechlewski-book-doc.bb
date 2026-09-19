SUMMARY = "Documentation for texlive-przechlewski-book"
DESCRIPTION = "This package includes the documentation for texlive-przechlewski-book"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn23552"

RPM_NAME = "texlive-przechlewski-book-doc-2026.226.svn23552-59.2.noarch.rpm"
RPM_HASH = "3866fc2bad05c4b26ca67a51505510cc6e1261e72e1fbb6777f8b880efa88cab2f6a54a02af4662bea2025d91b816f4f29ad0a78af5e632ad38441008ef6dd88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-przechlewski-book-doc-en;pl \
texlive-przechlewski-book-doc"

RDEPENDS:${PN} += ""

inherit rpm
