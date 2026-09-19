SUMMARY = "Drawing lenses and mirrors for optical diagrams"
DESCRIPTION = "This package provides some of macros for drawing simple lenses \
and mirrors for use in optical diagrams."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.1svn62977"

RPM_NAME = "texlive-simpleoptics-2026.226.1.1.1svn62977-60.2.noarch.rpm"
RPM_HASH = "7b81576dd6c18bd782c8dfbd58701f8bdf9c7b9a5382c9b7c62d40144a688cf80ffe9276a97f8efd0d9b6a1c2566d3a368bb3da78bcc461bd62ad60e0a93c48a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-simpleoptics.sty \
texlive-simpleoptics"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
