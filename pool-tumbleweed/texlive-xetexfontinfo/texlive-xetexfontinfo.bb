SUMMARY = "Report font features in XeTeX"
DESCRIPTION = "A pair of documents to reveal the font features supported by \
fonts usable in XeTeX. Use OpenType-info.tex for OpenType \
fonts, and AAT-info.tex for AAT fonts (Mac OS X only)."
LICENSE = "Apache-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-xetexfontinfo-2026.226.svn15878-59.4.noarch.rpm"
RPM_HASH = "a5297ed4656c222ca6e70419e8a9e95db7eb817248a70556cccbe931033b4c0d3b2f240b5552962fd496192726cc48afbecbfbfc5766653e25f3cac269b2371c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-aat-info.tex \
tex-opentype-info.tex \
texlive-xetexfontinfo"

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
