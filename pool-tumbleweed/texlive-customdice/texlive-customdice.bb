SUMMARY = "Simple commands for drawing customisable dice"
DESCRIPTION = "The customdice package for LaTeX, LuaLaTeX and XeTeX that \
provides functionality for drawing dice. The aim is to provide \
highly-customisable but simple-to-use commands, allowing: \
adding custom text to dice faces; control over colouring; \
control over sizing."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn64089"

RPM_NAME = "texlive-customdice-2026.226.1.1svn64089-61.2.noarch.rpm"
RPM_HASH = "352448fb2c269142cc31a4561d6102b08e055564ff2a95fbfc80f9f6fe454d066615314ed20a3b81fdab3ed79d517034a1e22ec4c1f4caab518b67be01a3e0fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-customdice.sty \
texlive-customdice"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
