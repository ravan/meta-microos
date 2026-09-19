SUMMARY = "LaTeX classes for preparing grant proposals to National Science and Technology Council, Taiwan"
DESCRIPTION = "This package consists of LaTeX classes for preparing grant \
proposals to the National Science and Technology Council, \
Taiwan, that is: CM03 CM302 which support typesetting in both \
Chinese and English and are compatible with pdfLaTeX and XeTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn72795"

RPM_NAME = "texlive-nstc-proposal-2026.226.1.0svn72795-61.2.noarch.rpm"
RPM_HASH = "f895a8f16dc8a0effe96e29a314414f002329f6b7247de779c11dd3d9910b65351f7b3a57e0f799ff7ff1da72034100ac1e19aa2698488aea25800f2fe300299"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nstc-cm03.cls \
tex-nstc-cm302.cls \
texlive-nstc-proposal"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-CJKutf8.sty \
tex-amsmath.sty \
tex-amsthm.sty \
tex-article.cls \
tex-c70bkai.fd \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-iftex.sty \
tex-lastpage.sty \
tex-libertine.sty \
tex-newtxmath.sty \
tex-newtxtext.sty \
tex-setspace.sty \
tex-titlesec.sty \
tex-unicode-math.sty \
tex-xeCJK.sty \
tex-xifthen.sty \
tex-zhnumber.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
