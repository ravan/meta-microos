SUMMARY = "DictSym font and macro package"
DESCRIPTION = "This directory contains the DictSym Type1 font designed by \
Georg Verweyen and all files required to use it with LaTeX on \
the Unix or PC platforms. The font provides a number of symbols \
commonly used in dictionaries. The accompanying macro package \
makes the symbols accessible as LaTeX commands."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-dictsym-2026.226.svn77682-59.2.noarch.rpm"
RPM_HASH = "502af4c8e5815223a681727327583bae83de75148094a10f6b7613d67aef201cb4c3e21119b53381ed0945db4efd0a12ac702d671904bfb9fa0aff5fd16a3159"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dictsym.map \
tex-dictsym.sty \
tex-dictsym.tfm \
texlive-dictsym"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
tex-pifont.sty \
tex-updmap.cfg \
texlive \
texlive-dictsym-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
