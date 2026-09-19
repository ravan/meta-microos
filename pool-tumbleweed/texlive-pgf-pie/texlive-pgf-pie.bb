SUMMARY = "Draw pie charts, using PGF"
DESCRIPTION = "The package provides the means to draw pie (and variant) \
charts, using PGF/TikZ."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.7svn63603"

RPM_NAME = "texlive-pgf-pie-2026.226.0.0.7svn63603-58.2.noarch.rpm"
RPM_HASH = "38d2f2776f538877dcfd3117ec0e149386736ddfd73c1807020151db489a81baef5885c0ba6525da242292881caf50e27feee616d158c7e7c9c4b75160534084"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pgf-pie.sty \
tex-tikzlibrarypie.code.tex \
texlive-pgf-pie"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-carlisle \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-latex \
texlive-pgf \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
