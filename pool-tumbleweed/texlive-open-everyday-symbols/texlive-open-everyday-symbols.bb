SUMMARY = "A list of 'everyday' symbols, to be extended by everybody"
DESCRIPTION = "This is meant to be a community project: It's a list of \
symbols/icons from an 'everyday' context. It can literally be \
everything, and thus does not aim at mathematical symbols or \
the like. It's basically an icons portfolio -- tiny at this \
stage (basically merely providing the infrastructure for more \
symbols), but we hope for contributions from the community. \
Just create some symbols and make a pull request."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn75127"

RPM_NAME = "texlive-open-everyday-symbols-2026.226.1.1svn75127-61.2.noarch.rpm"
RPM_HASH = "1ead8f701f36149c1f72987b1312736ef545d4a7daf7a0d0ea0003815a54c551cbd44acce6fbfa0a29d2aa43c275d57e1e578560ad7d5b0813cc2034f481a68a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-open-everyday-symbols.sty \
texlive-open-everyday-symbols"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-tikz.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
