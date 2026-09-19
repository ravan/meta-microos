SUMMARY = "Draw histograms with the LaTeX picture environment"
DESCRIPTION = "This is a collection pf macros to draw histogram bars inside a \
LaTeX picture-environment."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.01svn15878"

RPM_NAME = "texlive-histogr-2026.226.1.01svn15878-60.4.noarch.rpm"
RPM_HASH = "bdafe64161ed7eeee6b60667808b1834be6eb7bff6eb75538d348a91bfb6b08f79fe5f4f93a43500bb1a43f34f0ffd7f39a89cf881f64853ab0c123a86b926d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-histogr.sty \
texlive-histogr"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
