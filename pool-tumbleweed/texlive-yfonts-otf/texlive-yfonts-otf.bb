SUMMARY = "OpenType version of the Old German fonts designed by Yannis Haralambous"
DESCRIPTION = "This is an OpenType version of the Old German fonts yfrak, \
ygoth, yswab designed by Yannis Haralambous in Metafont. The \
OpenType features make it easier to deal with the long/round s \
and with older forms of umlauts (small e over the letter). A \
style file yfonts-otf.sty is provided as a replacement, for \
LuaLaTeX and XeLaTeX, of yfonts.sty or oldgerm.sty."
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.61svn77682"

RPM_NAME = "texlive-yfonts-otf-2026.226.0.0.61svn77682-59.4.noarch.rpm"
RPM_HASH = "d60a317b2060993665c6897dd7279e3544bdcbd4323c494a9678516bd22b6888a1c78b502ef534e1cf18d85bd65613bcfa2ad790c5d69b0d72992f0ce6d3ac7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-oldgerm-otf.sty \
tex-yfonts-otf.sty \
texlive-yfonts-otf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-iftex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-yfonts-otf-fonts"

inherit rpm
