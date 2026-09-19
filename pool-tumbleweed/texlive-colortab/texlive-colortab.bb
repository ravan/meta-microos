SUMMARY = "Shade cells of tables and halign"
DESCRIPTION = "The package lets you shade or colour the cells in the alignment \
environments such as \\halign and LaTeX's tabular and array \
environments. The colortbl package is to be preferred today \
with LaTeX (it assures compatibility with the longtable \
package, which is no longer true with colortab); another modern \
option is the table-colouring option of the xcolor. However, \
colortab remains an adequate solution for use with Plain TeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn22155"

RPM_NAME = "texlive-colortab-2026.226.1.0svn22155-60.2.noarch.rpm"
RPM_HASH = "517ad6edaf5c1107d6deb3537289002aa1da8ddf28d5b95c271373ba9bd9e8ccd14afbd855f9e4b0672df234390bcf00d7032b259208a26aea86dedfa8708a6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-colortab.sty \
tex-colortab.tex \
texlive-colortab"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fancybox.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
