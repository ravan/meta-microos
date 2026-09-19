SUMMARY = "A 'lipsum' package for the Kurdish language"
DESCRIPTION = "This package provides lipsum-like facilities for the Kurdish \
language. The package gives you easy access to the Kurdish \
poetry and balladry texts of the Diwany Vafaiy, Ahmedy Xani, \
Naly, Mahwy,.... The package needs to be run under XeLaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77682"

RPM_NAME = "texlive-kurdishlipsum-2026.226.1.1svn77682-63.2.noarch.rpm"
RPM_HASH = "0d52c1f8814229bfc2b8e2139856ab33c81f07d4f1cc45b3a515a7918805f80f7cbd320f4ad804d8f92faa9942421209eee89a9f2548285aeb9f20aeaf0db147"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-kurdishlipsum.sty \
texlive-kurdishlipsum"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-biditools.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
