SUMMARY = "Syntax highlighting for LaTeX"
DESCRIPTION = "This package provides extensive colored syntax highlighting for \
LaTeX. For this purpose it builds on the generic listings \
package."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn58392"

RPM_NAME = "texlive-highlightlatex-2026.226.svn58392-60.4.noarch.rpm"
RPM_HASH = "66e7f4a59c150a6cfc046037ced8b258e80e1921e1cd9280698c9fb4e914d889af4e10d88da7a84b0336a58019e442bd7f79cde8e0a7565c580ede9ea2f2e09b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-highlightlatex.sty \
texlive-highlightlatex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-listings.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
