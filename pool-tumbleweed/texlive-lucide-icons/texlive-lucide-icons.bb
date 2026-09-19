SUMMARY = "Use lucide-icons through LaTeX commands"
DESCRIPTION = "This package provides commands like twemojis which allow to use \
Lucide-Icons through LaTeX commands. The implementation relies \
on images (PDF from SVG) and should work on every installation."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.1svn77188"

RPM_NAME = "texlive-lucide-icons-2026.226.0.0.1.1svn77188-59.2.noarch.rpm"
RPM_HASH = "f8d16d8b62a240a400cf59c0cd854ca18c5c05da3cd1426b52d7fb47746397e4c4e447a7f005ba249a7535354d3dd516a8f201ea3b687b2e67e69db275fe9817"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lucide-icons.sty \
texlive-lucide-icons"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-simplekv.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
