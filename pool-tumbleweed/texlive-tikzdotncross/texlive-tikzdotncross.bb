SUMMARY = "Marking coordinates and crossing paths"
DESCRIPTION = "This package offers a few alternative ways for declaring and \
marking coordinates and drawing a line with 'jumps' over an \
already existent path, which is quite a common issue when \
drawing, for instance, electronic circuits (like with \
CircuiTikZ)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3bsvn77050"

RPM_NAME = "texlive-tikzdotncross-2026.226.1.3bsvn77050-59.2.noarch.rpm"
RPM_HASH = "a83c0638a62e4fea060e33c0e16d52c945a52e8b8a7b71384090674adff380fb1fbd465d30697b3893f32dd9d3c8d03aa87e228fa1bcf5536bcf990bf4032249"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzdotncross.sty \
texlive-tikzdotncross"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-pkginfograb.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
