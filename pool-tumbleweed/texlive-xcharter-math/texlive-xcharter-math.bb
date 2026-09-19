SUMMARY = "XCharter-based OpenType Math font for LuaTeX and XeTeX"
DESCRIPTION = "This package provides an Unicode Math font XCharter-Math.otf \
meant to be used together with XCharter Opentype Text fonts \
(extension of Bitstream Charter) in LuaLaTeX or XeLaTeX \
documents."
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.73svn78170"

RPM_NAME = "texlive-xcharter-math-2026.226.0.0.73svn78170-59.4.noarch.rpm"
RPM_HASH = "2a348392d8865f946e2df8de2cc4fdab87146fd9d8f426e512759cb494c60045d153f19143dd39c3d5352d4d7789b26b35bf0c9528278ace1cce1a9e251de794"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xcharter-otf.sty \
texlive-xcharter-math"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-iftex.sty \
tex-lua-unicode-math.sty \
tex-realscripts.sty \
tex-unicode-math.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-xcharter-math-fonts"

inherit rpm
