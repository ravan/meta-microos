SUMMARY = "Cistercian numerals in LaTeX"
DESCRIPTION = "This package allows you to use Cistercian numerals in LaTeX. \
The glyphs are created using PGF and to a certain degree \
configurable. You can use Cistercian numerals as page numbers \
using \\pagenumbering{cistercian}. The two main macros are: \
\\cistercian{<counter>} formats the LaTeX2e counter as a \
Cistercian numeral, \\cisterciannum{<integer>} formats the \
integer (given as a string) as a Cistercian numeral."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn77682"

RPM_NAME = "texlive-xistercian-2026.226.1.3svn77682-59.4.noarch.rpm"
RPM_HASH = "eef3ae8590839940fb39f49b4bf31d24a8b6163beed082c4fbdb791beee174b9129e325d0d8e658f0fbe11c4d4b07776b4dc6d9bd7ce29ec700544c4d3a3638d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xistercian.sty \
texlive-xistercian"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expkv-opt.sty \
tex-pgf.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
