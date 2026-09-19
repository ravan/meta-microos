SUMMARY = "Additional font selection axes for LaTeX"
DESCRIPTION = "The package adds several new font axes on top of LaTeX's New \
Font Selection Scheme. In particular, it splits the shape axis \
into a primary and a secondary shape axis, and it adds three \
new axes to deal with the different figure versions offered by \
many professional fonts. This package has nowadays been \
deprecated in favour of the figureversions package."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0.2svn77682"

RPM_NAME = "texlive-fontaxes-2026.226.2.0.2svn77682-60.2.noarch.rpm"
RPM_HASH = "74d666011fa78158fa34904787e17e68081d9e89b6e1f631f007bcf8cdf2a1742de72a46abf9abdd0fc1448f20de1281e6150cd8c5839ad3d2f46d15284e2ebe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fontaxes-v1.sty \
tex-fontaxes.sty \
texlive-fontaxes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-figureversions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
