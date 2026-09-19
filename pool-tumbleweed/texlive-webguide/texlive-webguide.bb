SUMMARY = "Brief guide to LaTeX tools for Web publishing"
DESCRIPTION = "The documentation constitutes an example of the package's own \
recommendations (being presented both in PDF and HTML)."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77050"

RPM_NAME = "texlive-webguide-2026.226.svn77050-60.2.noarch.rpm"
RPM_HASH = "f7c711d5d0c494e1bcbf9d8957af3b9e4909d6d7c50595e695ddf4c52f10597b4e9f608b1dff892a74e384a154c1c493916ffbe3ff9ac514340b8efcdf333fd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-webguide"

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
