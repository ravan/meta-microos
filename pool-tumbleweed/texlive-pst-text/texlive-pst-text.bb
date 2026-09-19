SUMMARY = "Text and character manipulation in PSTricks"
DESCRIPTION = "Pst-text is a PSTricks based package for plotting text along a \
different path and manipulating characters. It includes the \
functionality of the old package pst-char."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.02svn77682"

RPM_NAME = "texlive-pst-text-2026.226.1.02svn77682-60.4.noarch.rpm"
RPM_HASH = "7e3d4c4fae0fda945c1d1982b65ee400360e7f4de0a8ffa5a91eaaace5ad8898c94db5c7e892dcc5095a440cf819c729b33d00aa0d4e82170cef9b4e1742c29f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-char.sty \
tex-pst-text.sty \
tex-pst-text.tex \
texlive-pst-text"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
