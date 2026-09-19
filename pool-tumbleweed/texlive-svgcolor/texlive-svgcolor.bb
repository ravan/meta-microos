SUMMARY = "Define SVG named colours"
DESCRIPTION = "The package defines the W3C Scalable Vector Graphics (SVG) \
colour names for use with both the color and PSTricks packages."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-svgcolor-2026.226.1.0svn15878-64.2.noarch.rpm"
RPM_HASH = "81742b80394b6183e4491d58674ae8a4d959e66325426c8f4cc9acd6996f01afebf4b332345f538730e2b728a837b2faa02713d4995e0bfc38884766426712ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-svgcolor.sty \
texlive-svgcolor"

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
