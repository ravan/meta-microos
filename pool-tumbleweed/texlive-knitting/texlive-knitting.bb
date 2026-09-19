SUMMARY = "Produce knitting charts, in Plain TeX or LaTeX"
DESCRIPTION = "The package provides symbol fonts and commands to write charted \
instructions for cable and lace knitting patterns, using either \
plain TeX or LaTeX. The fonts are available both as Metafont \
source and in Adobe Type 1 format."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0svn50782"

RPM_NAME = "texlive-knitting-2026.226.3.0svn50782-63.2.noarch.rpm"
RPM_HASH = "baf6e548b9eccbf1a4a1a909a3b08020a22cbbaf18b66a2d927745d63cc5b061eaa5aa795b5d74465cef015a60b4ab7773c61c89ac601d20b864724af99a4782"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-knitfont.map \
tex-knitg-sc-in.tfm \
tex-knitg-sc-out.tfm \
tex-knitgg.tfm \
tex-knitgn.tfm \
tex-knitgp.tfm \
tex-knitmg.tfm \
tex-knitml.tfm \
tex-knitmn.tfm \
tex-knitmp.tfm \
tex-knitmr.tfm \
tex-knitn-sc-in.tfm \
tex-knitn-sc-out.tfm \
tex-knitnl.tfm \
tex-knitnn.tfm \
tex-knitnp.tfm \
tex-knitnr.tfm \
tex-knitting.sty \
tex-knitting.tex \
tex-knitwg.tfm \
tex-knitwn.tfm \
tex-knitwp.tfm \
tex-uknit.fd \
texlive-knitting"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-knitting-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
