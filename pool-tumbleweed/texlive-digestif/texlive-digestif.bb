SUMMARY = "Editor plugin for LaTeX, ConTeXt etcetera"
DESCRIPTION = "Digestif is a code analyzer, and a language server, for LaTeX, \
plain TeX, ConTeXt and Texinfo. It provides context-sensitive \
completion, documentation, code navigation, and related \
functionality to any text editor that speaks the LSP protocol."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.6svn72163"

RPM_NAME = "texlive-digestif-2026.226.0.0.6svn72163-59.2.noarch.rpm"
RPM_HASH = "b4fc2c756b2b45f08ec1c98258b00af8770fd6de4454bf1460d4c9eae3fe9f4b289bc6ea700dc75a56b42ba00134a43133d09e48aef6e807e356679252105de4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-digestif"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-digestif-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
