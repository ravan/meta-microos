SUMMARY = "Enclose the document body with some pieces of code"
DESCRIPTION = "The package enables authors to designate in the preamble to \
make the document body enclosed with the given pieces of code. \
As is known, there are already various mechanisms provided by \
LaTeX kernel or packages that attach hooks at the beginning and \
end of documents."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn40213"

RPM_NAME = "texlive-bxenclose-2026.226.0.0.2svn40213-59.2.noarch.rpm"
RPM_HASH = "b1cdbe12da462147d94e48c0087b7043118a16ce6e88bc20d4dd648c1ecc086a1ac6e6fc4e10a2bc825376a8e13cae395475f66810c3f80adf593593573b494f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bxenclose.sty \
texlive-bxenclose"

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
