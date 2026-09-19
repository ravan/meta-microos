SUMMARY = "Unicode-compatible index generation"
DESCRIPTION = "This package provides a Unicode-compatible index program for \
LaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.04svn77844"

RPM_NAME = "texlive-xindex-2026.226.1.04svn77844-59.4.noarch.rpm"
RPM_HASH = "33121822ab8f88bfad4438baa2316018f2c5e2ff0c9c26d0419908aaccb717f142e26fe6729dbc29a9d9522aeb581fcc5daea68fcd0d447664c320f0e6fd8a56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xindex.sty \
texlive-xindex"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
tex-imakeidx.sty \
tex-makeidx.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-xindex-bin"

inherit rpm
