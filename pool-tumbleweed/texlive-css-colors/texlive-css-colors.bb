SUMMARY = "Named colors for web-safe design"
DESCRIPTION = "This package defines web-safe colors for use with D.P. \
Carlisle's color package. It is intended for both authors and \
package writers (e.g. to create Beamer color themes)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.02svn54512"

RPM_NAME = "texlive-css-colors-2026.226.1.02svn54512-61.2.noarch.rpm"
RPM_HASH = "ba1a13183af6b714009d3322a2647d3a56c4f022f06d7100382021f32e9fc2495dbf0620c94c33f10cf1b488a5b908c5b0952a345935e8267693b6e77819ad9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-css-colors.sty \
texlive-css-colors"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
