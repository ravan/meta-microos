SUMMARY = "Monthly Notices of the Royal Astronomical Society"
DESCRIPTION = "Package for preparing papers in the journal 'Monthly Notices of \
the Royal Astronomical Society'."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.2svn68878"

RPM_NAME = "texlive-mnras-2026.226.3.2svn68878-61.2.noarch.rpm"
RPM_HASH = "993fc2b33a2a4d3d0106cb14db9be1116b684f54983493de45f81c96460c256dbeb7520a0ceb6c67718981586c6424d326395adbfbda62f5ee5d9f4ab1170be5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mnras.cls \
texlive-mnras"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-dcolumn.sty \
tex-geometry.sty \
tex-hyperref.sty \
tex-natbib.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
