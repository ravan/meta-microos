SUMMARY = "Create 'railroad' syntax diagrams"
DESCRIPTION = "This package provides TikZ styles for creating special syntax \
diagrams known as 'railroad' diagrams. The package was \
originally distributed as part of the schule bundle."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.8.2svn56685"

RPM_NAME = "texlive-syntaxdi-2026.226.0.0.8.2svn56685-64.2.noarch.rpm"
RPM_HASH = "972aab42bfd7b03db0d894ba3388882b8600b1c8c9ece9c610ad1d191b84da7e2243106e663091ab47bc8baba8a92191b7b6ccee5380ece9f2128523e9b150f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-syntaxdi.sty \
texlive-syntaxdi"

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
