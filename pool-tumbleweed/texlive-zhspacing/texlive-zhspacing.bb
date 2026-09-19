SUMMARY = "Spacing for mixed CJK-English documents in XeTeX"
DESCRIPTION = "The package manages spacing in a CJK document; between \
consecutive Chinese letters, spaces are ignored, but a \
consistent space is inserted between Chinese text and English \
(or mathematics). The package may be used by any document \
format under XeTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn41145"

RPM_NAME = "texlive-zhspacing-2026.226.svn41145-59.4.noarch.rpm"
RPM_HASH = "f6d04e24cf42132a6e8e3f467401098c7bd39cb3160026acc01c5b74e82443e354c73e29dc1e4847011d9622404249851b165593abafba75de5277b88f66a1a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-t-zhspacing.tex \
tex-zhfont.sty \
tex-zhmath.sty \
tex-zhsmyclass.sty \
tex-zhspacing.sty \
tex-zhsusefulmacros.sty \
tex-zhulem.sty \
texlive-zhspacing"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-ulem.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
