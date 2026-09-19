SUMMARY = "Place a classification on each page of a document"
DESCRIPTION = "Enables the user to place a 'classification' label on each \
page, at the bottom to the right of the page number"
LICENSE = "LPPL-1.0"

PV = "2026.227.svn16372"

RPM_NAME = "texlive-tex-label-2026.227.svn16372-62.2.noarch.rpm"
RPM_HASH = "bfdccff5281d9afcd821d2c9159e6ec1fe545c1b518b9e48c5b2ea8c760a93358cebfe7fb399119b0c71bd3ba4c6ca4cccf8af24c788b4b5412a7d772a00a0ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tex-label.sty \
texlive-tex-label"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-fancyhdr.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
