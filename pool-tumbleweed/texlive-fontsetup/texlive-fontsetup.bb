SUMMARY = "A front-end to fontspec, for selected fonts with math support"
DESCRIPTION = "This package facilitates the use of fontspec for users who do \
not wish to bother with details, with a special focus on \
quality fonts supporting Mathematics."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.3.0svn77682"

RPM_NAME = "texlive-fontsetup-2026.226.2.3.0svn77682-60.2.noarch.rpm"
RPM_HASH = "2b9957ef56c714a843b9edb25c03a202c20f4bf5a9f42e0f53f9aaaaabf33612ce6d4cff148e1ea6d2e18da6b0a5e656feb903265034446bb0d85ad131b7e3da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fontsetup.sty \
tex-fspconcrete.tex \
tex-fspdefault.tex \
tex-fspebgaramondot.tex \
tex-fsperewhon.tex \
tex-fspeulerot.tex \
tex-fspfiraot.tex \
tex-fspgfsartemisiaot.tex \
tex-fspgfsdidotclassicot.tex \
tex-fspgfsdidotot.tex \
tex-fspgfsneohellenicot.tex \
tex-fspkerkisot.tex \
tex-fspolddefault.tex \
tex-fspoldstandard.tex \
tex-fspsansdefault.tex \
tex-fspstixtwoot.tex \
tex-fsptalos.tex \
tex-fsptimesot.tex \
tex-fspxcharter.tex \
texlive-fontsetup"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-fourier-otf.sty \
tex-iflang.sty \
tex-iftex.sty \
tex-libertinus-otf.sty \
tex-ucharclasses.sty \
tex-unicode-math.sty \
tex-xcharter-otf.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
