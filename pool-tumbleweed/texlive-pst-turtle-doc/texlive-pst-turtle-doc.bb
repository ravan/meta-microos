SUMMARY = "Documentation for texlive-pst-turtle"
DESCRIPTION = "This package includes the documentation for texlive-pst-turtle"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.02svn52261"

RPM_NAME = "texlive-pst-turtle-doc-2026.226.0.0.02svn52261-60.4.noarch.rpm"
RPM_HASH = "af71d8381b4c76b44b66113c0e165976babf9b5405e7d7a38f01280743182ff73ed756d48cd9de6b0745ea787163511efd1df77d7f2b4fb60442a0bc675e995a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-turtle-doc"

RDEPENDS:${PN} += ""

inherit rpm
