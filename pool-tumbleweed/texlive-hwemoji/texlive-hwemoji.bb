SUMMARY = "Unicode emoji support for pdfLaTeX with sequences"
DESCRIPTION = "This package provides direct support for Unicode emoji in \
pdfLaTeX, with full access to emoji sequences including but not \
limited to flag sequences, diversity modifier sequences, and \
tag sequences. Emojis are displayed through Twemoji digital \
assets, as licensed under the CC-BY 4.0."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn65001"

RPM_NAME = "texlive-hwemoji-2026.226.1.0svn65001-60.2.noarch.rpm"
RPM_HASH = "5e9cbc0567af4f7fe3702c060d2ddd4e8e47517e6f2b831530eabef1d2893aa6bd7c48305f87475ea7be004345988aec8a0d40860ba12650f453b33c2ee169bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hwemoji.sty \
texlive-hwemoji"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifnextok.sty \
tex-scalerel.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
