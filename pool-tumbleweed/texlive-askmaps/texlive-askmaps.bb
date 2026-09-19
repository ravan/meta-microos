SUMMARY = "Typeset American style Karnaugh maps"
DESCRIPTION = "The package provides 1, 2, 3, 4 and 5 variable Karnaugh maps, \
in the style used in numerous American textbooks on digital \
design. The package draws K-maps where the most significant \
input variables are placed on top of the columns and the least \
significant variables are placed left of the rows."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn56730"

RPM_NAME = "texlive-askmaps-2026.226.0.0.2svn56730-60.2.noarch.rpm"
RPM_HASH = "c764e2a36835c0c1f32cd18ee17313060978f09b43f60669c2847470fd65616e082838fcdcca16db8b9db3ea9a7e9e041d8908b09e516a515ed094cdf195e69f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-askmaps.sty \
texlive-askmaps"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pict2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
