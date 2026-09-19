SUMMARY = "Print TeX-related names as logo"
DESCRIPTION = "This package is more or less an extension to Heiko Oberdiek's \
package hologo. It prints TeX-related names as logos. The \
package requires fetamont, hologo, dantelogo, and xspace."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.16svn77682"

RPM_NAME = "texlive-hvlogos-2026.226.0.0.16svn77682-60.2.noarch.rpm"
RPM_HASH = "544208b74536d9fb0f0d71eeadd3e0174c4c9bcdfab6402773106bace0556068e217b3865a3e580fd428aebeb8986b0fd88f9e89a5d2e2c1306be7a839d22240"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hvlogos.sty \
texlive-hvlogos"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-dantelogo.sty \
tex-expl3.sty \
tex-fetamont.sty \
tex-hologo.sty \
tex-tikz.sty \
tex-unicode-math.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
