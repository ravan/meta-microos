SUMMARY = "Grid typesetting in LaTeX"
DESCRIPTION = "The package helps to enables grid typesetting in double column \
documents. Grid typesetting (vertical aligning of lines of text \
in adjacent columns) is a difficult task in LaTeX, and the \
present package is no more than an attempt to help users to \
achieve it in a limited way. An example document, grid.tex, is \
provided with simple instructions to typeset it using the \
package. The package needs a lot more work: this is only a \
beginning..."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn61719"

RPM_NAME = "texlive-grid-2026.226.1.0svn61719-60.4.noarch.rpm"
RPM_HASH = "4c75bf1461cb2b36cf53e013b9d3127cea46bfd6cec6d12a814c240c937b0727759ab32572be0f9a2f2a3512449a9f5ee0790811323d24fe788cc261c954c34a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-grid.sty \
texlive-grid"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
