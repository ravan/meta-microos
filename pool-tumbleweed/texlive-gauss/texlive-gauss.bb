SUMMARY = "A package for Gaussian operations"
DESCRIPTION = "The gauss package provides configurable tools for producing row \
and column operations on matrices (a.k.a. Gaussian operations)."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn32934"

RPM_NAME = "texlive-gauss-2026.226.svn32934-60.2.noarch.rpm"
RPM_HASH = "005a4c9c0c9797d5a4c0cba6fe4d0665639c7f2d6312166712bad3b796f47b4796753c57cac66d91d6b30112ed5fcaf25b9af18decdb306df4feeda13346da84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gauss.sty \
texlive-gauss"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
