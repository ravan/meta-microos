SUMMARY = "Documentation for texlive-lua-typo"
DESCRIPTION = "This package includes the documentation for texlive-lua-typo"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.88svn77682"

RPM_NAME = "texlive-lua-typo-doc-2026.226.0.0.88svn77682-59.2.noarch.rpm"
RPM_HASH = "a177cf9fc7d915f7bbdbdf080c961608dd260f8cba3f2a9540bfeb876aa9bcb507da36d2fd3aabcf095dc3d234fc5e592a79c60ed83e6ddd68ce9eaf9a7ab143"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-lua-typo-doc-fr \
texlive-lua-typo-doc"

RDEPENDS:${PN} += ""

inherit rpm
