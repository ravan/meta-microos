SUMMARY = "Document LaTeX packages in a consistent way"
DESCRIPTION = "This package offers a variety of features for documenting LaTeX \
packages, ensuring consistent presentation, cross-referencing, \
and index generation. It also supports version and change \
tracking to maintain a consistent change history."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn73661"

RPM_NAME = "texlive-packdoc-2026.226.0.0.1svn73661-58.2.noarch.rpm"
RPM_HASH = "7cdbdf9887366112339e6df16ce9eece3831df832048a49d7cf28625f99e2d616fa77836477b62f01dab6a1871b1edca3232f3bd0ee199c8b07b894ed4c12258"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-packdoc.sty \
texlive-packdoc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cleveref.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-geometry.sty \
tex-hyperref.sty \
tex-makeidx.sty \
tex-marginnote.sty \
tex-minted.sty \
tex-multicol.sty \
tex-nowidow.sty \
tex-pgfopts.sty \
tex-ragged2e.sty \
tex-snaptodo.sty \
tex-tcolorbox.sty \
tex-textcomp.sty \
texlive \
texlive-enumitem \
texlive-etoolbox \
texlive-filesystem \
texlive-geometry \
texlive-hyperref \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-marginnote \
texlive-minted \
texlive-nowidow \
texlive-pgfopts \
texlive-ragged2e \
texlive-scripts \
texlive-scripts-bin \
texlive-snaptodo \
texlive-tcolorbox \
texlive-tools"

inherit rpm
