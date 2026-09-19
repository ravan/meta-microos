SUMMARY = "Typing in the Lydian alphabet"
DESCRIPTION = "This package aims to allow platform-agnostic typing in the \
Lydian alphabet using LaTeX, in particular as a way to deal \
with the fact that Overleaf does not support direct input of \
certain characters outside of a given Unicode range. The \
package was developed for use with LuaLaTeX and XeLaTeX, \
functionality with other compilers is not guaranteed. The \
package includes the Noto Sans Lydian font as developed by \
Google."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn76924"

RPM_NAME = "texlive-lydtype-2026.226.1.0svn76924-59.2.noarch.rpm"
RPM_HASH = "2dd5cb1ab518b93f3bbe3cd6663a0fe29839d63c0bf303629f9b8d4507a3bc28495fc5cf715c01df3511c00b8bf8861f8787e969e89ab8af7371964f920deb68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lydtype.sty \
texlive-lydtype"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-fontspec.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-lydtype-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
