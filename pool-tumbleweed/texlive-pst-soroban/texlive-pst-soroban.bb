SUMMARY = "Draw a Soroban using PSTricks"
DESCRIPTION = "The package uses PSTricks to draw a Japanese abacus, or \
soroban. The soroban is still used in Japan today."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-pst-soroban-2026.226.1.0svn15878-60.4.noarch.rpm"
RPM_HASH = "d7655f0ff22b594f9d9d614281504e4c05e9e8d18f6a14297d44fed6f3e2b987d4e1247dc492975efa1395e0dfd2af670ece903c24e753dc0c5be64f8903e957"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-soroban.sty \
texlive-pst-soroban"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifthen.sty \
tex-pstricks-add.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
