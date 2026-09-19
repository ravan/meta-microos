SUMMARY = "Documentation for texlive-thucoursework"
DESCRIPTION = "This package includes the documentation for texlive-thucoursework"
LICENSE = "LPPL-1.0"

PV = "2026.227.2.6svn56435"

RPM_NAME = "texlive-thucoursework-doc-2026.227.2.6svn56435-62.2.noarch.rpm"
RPM_HASH = "6e407ab12122cdc0cda0e5e4d0fe0d0abe9c4bfe5a771a7bdadb475c1aff018ce7b559e117a822d7c7d3977d3271b8ab99ba4890eeecfa02a8f81bc2e773862a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-thucoursework-doc-zh \
texlive-thucoursework-doc"

RDEPENDS:${PN} += ""

inherit rpm
