SUMMARY = "Use vscode icons through LaTeX commands"
DESCRIPTION = "This package inspired by twemojis provides commands to use the \
icons from the vscode-icons project through LaTeX commands. \
This relies on images (PDF from SVG), so no fancy unicode-font \
stuff is needed and it should work on every installation."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.0svn76927"

RPM_NAME = "texlive-vscodeicons-2026.226.0.0.1.0svn76927-60.2.noarch.rpm"
RPM_HASH = "03d4b550fb90e19d256240d1b17c2fb8c0fc2203b7b51269611e7ec0f1e7dc69c810f886ea2a21f19b214952053c172979276ab2361ebe8f5e0e5b41a7fb9b35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-vscodeicons.sty \
texlive-vscodeicons"

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
