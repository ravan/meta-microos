SUMMARY = "Babel support for Georgian"
DESCRIPTION = "The package provides support for use of Babel in documents \
written in Georgian. The package is adapted for use both under \
'traditional' TeX engines, and under XeTeX and LuaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2svn45864"

RPM_NAME = "texlive-babel-georgian-2026.226.2.2svn45864-60.2.noarch.rpm"
RPM_HASH = "58aff63d0a99d1e707fb165810b01a0cbfe67af95d3bf277846da66740ebc29320e621c3076e319c1e14bdae11f5a8ae148565bf1dc6baa23d3a41382ea7a498"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-georgian.ldf \
tex-georgian.sty \
tex-georgiancaps.tex \
texlive-babel-georgian"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
