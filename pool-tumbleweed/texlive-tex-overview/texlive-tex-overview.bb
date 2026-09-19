SUMMARY = "An overview of the development of TeX"
DESCRIPTION = "The document gives a short overview of TeX and its children, as \
well as the macro packages LaTeX and ConTeXt."
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.2svn41403"

RPM_NAME = "texlive-tex-overview-2026.227.0.0.2svn41403-62.2.noarch.rpm"
RPM_HASH = "8f6e6caa920802c6312cee4017654c12338c79b7ea953f65ccae43c191a9e829387ae15244cb7cde6306daece8b95a5fb6750559a94a1f5774fb4f4058d12aab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tex-overview"

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
