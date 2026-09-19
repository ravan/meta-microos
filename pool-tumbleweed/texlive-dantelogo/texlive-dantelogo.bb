SUMMARY = "A font for DANTE's logo"
DESCRIPTION = "The DANTE font for the logo of DANTE (http://www.dante.de), the \
German speaking TeX users group. The font includes only the \
five characters d, a, n, t, and e. dantelogo.sty provides an \
interface for LuaLaTeX/XeLaTeX/pdfLaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.03svn38599"

RPM_NAME = "texlive-dantelogo-2026.226.0.0.03svn38599-61.2.noarch.rpm"
RPM_HASH = "a9f07246c1080a0f6cca05d25c6815bbdc5416f78d7786ee57f9aade5684381253405c9eb61935917ca18d0cdb26d1229ad0c076acb1f3d8fa9208d16dc08da6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-DANTE-Bold--texnansx--base.tfm \
tex-DANTE-Bold--texnansx.tfm \
tex-DANTE-Bold--texnansx.vf \
tex-DANTE-Bold-Italic--texnansx--base.tfm \
tex-DANTE-Bold-Italic--texnansx.tfm \
tex-DANTE-Bold-Italic--texnansx.vf \
tex-DANTE-Bold.tfm \
tex-DANTE-Italic--texnansx--base.tfm \
tex-DANTE-Italic--texnansx.tfm \
tex-DANTE-Italic--texnansx.vf \
tex-DANTE.tfm \
tex-OT1DANTE.fd \
tex-T1DANTE.fd \
tex-dante.enc \
tex-dante.map \
tex-dantelogo.sty \
texlive-dantelogo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontenc.sty \
tex-fontspec.sty \
tex-iftex.sty \
tex-updmap.cfg \
texlive \
texlive-dantelogo-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
