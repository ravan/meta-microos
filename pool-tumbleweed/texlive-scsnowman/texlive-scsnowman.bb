SUMMARY = "Snowman variants using TikZ"
DESCRIPTION = "This LaTeX package provides a command \\scsnowman which can \
display many variants of 'snowman' ('yukidaruma' in Japanese). \
TikZ is required for drawing these snowmen."
LICENSE = "BSD-3-Clause"

PV = "2026.226.1.3csvn66115"

RPM_NAME = "texlive-scsnowman-2026.226.1.3csvn66115-60.2.noarch.rpm"
RPM_HASH = "704fe7d0cd9dc0d3665330400ad62abe88282df339361cf1ce58c6d3ab9780a2363f9608020868a6dd3371f90ffed96ae46ce7ba873c985a2be7141a70c2b37f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-scsnowman-normal.def \
tex-scsnowman.sty \
tex-sctkzsym-base.sty \
texlive-scsnowman"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
tex-pxeveryshi.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
