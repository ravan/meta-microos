SUMMARY = "Support multiple lines of pseudocode"
DESCRIPTION = "This package extends the package algorithmicx to support long \
text which spans over multiple lines."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.99.2asvn76924"

RPM_NAME = "texlive-algxpar-2026.226.0.0.99.2asvn76924-61.2.noarch.rpm"
RPM_HASH = "551b4c682c72bac724d9f8aad6ef1677155c7632dc3750370c90fed77a4455d12c892e4cdddbe0b25d1474efab475fed26b59f1a77f434e5f326ffc894946d03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-algxpar-brazilian.kw.tex \
tex-algxpar-english.kw.tex \
tex-algxpar.sty \
texlive-algxpar"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-algorithmicx.sty \
tex-algpseudocode.sty \
tex-amssymb.sty \
tex-etoolbox.sty \
tex-pgfmath.sty \
tex-pgfopts.sty \
tex-ragged2e.sty \
tex-tikz.sty \
tex-varwidth.sty \
tex-xcolor.sty \
texlive \
texlive-algorithmicx \
texlive-amsfonts \
texlive-etoolbox \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pgf \
texlive-pgfopts \
texlive-ragged2e \
texlive-scripts \
texlive-scripts-bin \
texlive-varwidth \
texlive-xcolor"

inherit rpm
