SUMMARY = "Implements pdfTeX's escape features using TeX or e-TeX"
DESCRIPTION = "This package implements pdfTeX's escape features \
(\\pdfescapehex, \\pdfunescapehex, \\pdfescapename, \
\\pdfescapestring) using TeX or e-TeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.15svn77682"

RPM_NAME = "texlive-pdfescape-2026.226.1.15svn77682-58.2.noarch.rpm"
RPM_HASH = "92b5ddb0d02773eb73b757799bdad78855c8b8eb41efec9d29417388608d414971fe45711a940bb92f241effdd3b4c3a0327cffba248b09a8dcffc4c75f68d3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdfescape.sty \
texlive-pdfescape"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ltxcmds.sty \
tex-pdftexcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
