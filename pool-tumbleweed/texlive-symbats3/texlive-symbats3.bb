SUMMARY = "Macros to use the Symbats3 dingbats fonts"
DESCRIPTION = "This package makes available for LaTeX the glyphs in Feorag's \
OpenType Symbats3 neopagan dingbats fonts."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn63833"

RPM_NAME = "texlive-symbats3-2026.226.svn63833-64.2.noarch.rpm"
RPM_HASH = "d103cb551905782dab03fd52ca6e35abfe6959747530419d1cc1f1174efce7119d365a833020c5044dc71a6fa7f068ad98fad8524d43be7e8849dca43f8e3487"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-symbats3.sty \
texlive-symbats3"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-fontspec.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
