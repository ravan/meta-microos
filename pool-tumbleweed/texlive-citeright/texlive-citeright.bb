SUMMARY = "Specify accurate natbib citations for diverse naming conventions"
DESCRIPTION = "This package provides the command \\citeright for aliasing \
in-text citations and specifying their appearance in the list \
of references. It is specifically tailored for use with the \
natbib package and is compatible with citation managers such as \
BibDesk and JabRef. The package is intended to provide a means \
for respecting the diverse naming conventions of cited authors \
and, in this way, decolonizing academia."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn75480"

RPM_NAME = "texlive-citeright-2026.226.1.0.0svn75480-60.2.noarch.rpm"
RPM_HASH = "a4a1c53e63684fd22dea1b162c9eeb19c63ad84e3c6f3ddcc8f42ffb36b0cd488b3899f20edb0a4454a5a449084b50760ba2310733dd91493cfc1646ee407ddc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-citeright.sty \
texlive-citeright"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
