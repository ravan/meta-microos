SUMMARY = "Generate DOI banners and links"
DESCRIPTION = "A LaTeX package to generate DOI banners and links."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn71919"

RPM_NAME = "texlive-doibanner-2026.226.0.0.3svn71919-59.2.noarch.rpm"
RPM_HASH = "4e5fa5420cf14b56d3d498879ff0e801bf49dd976ce63d0fb57fd4ddc4e941bf16594e6598e179f256a600195f1ecfdf49ba589d30f88f082ff7d71372522b42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-doibanner.sty \
texlive-doibanner"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-adjustbox.sty \
tex-hyperref.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
