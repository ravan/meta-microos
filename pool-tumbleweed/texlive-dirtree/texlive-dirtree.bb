SUMMARY = "Display trees in the style of windows explorer"
DESCRIPTION = "This package is designed to emulate the way windows explorer \
displays directory and file trees, with the root at top left, \
and each level of subtree displaying one step in to the right. \
The macros work equally well with Plain TeX and with LaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.32svn77682"

RPM_NAME = "texlive-dirtree-2026.226.0.0.32svn77682-59.2.noarch.rpm"
RPM_HASH = "9a701100c78adc628acba90afde3237ee3c3660bb288739c345ec65c2428367dad275159d6c0087c43a0ceae308cfe6c89e52d6b85213e61fdf095d359fd8272"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dirtree.sty \
tex-dirtree.tex \
texlive-dirtree"

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
