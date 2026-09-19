SUMMARY = "Maths fonts to match tex-gyre text fonts"
DESCRIPTION = "TeX-Gyre-Math is a collection of maths fonts to match the text \
fonts of the TeX-Gyre collection. The collection is available \
in OpenType format, only; fonts conform to the developing \
standards for OpenType maths fonts. TeX-Gyre-Math-Bonum (to \
match TeX-Gyre-Bonum), TeX-Gyre-Math-Pagella (to match \
TeX-Gyre-Pagella), TeX-Gyre-Math-Schola (to match \
TeX-Gyre-Schola) and TeX-Gyre-Math-Termes (to match \
TeX-Gyre-Termes) fonts are provided."
LICENSE = "LPPL-1.3c"

PV = "2026.227.svn41264"

RPM_NAME = "texlive-tex-gyre-math-2026.227.svn41264-62.2.noarch.rpm"
RPM_HASH = "f696b4a2f5e717f9f22bf45467b03172311dfa81c3938ae6c13e255c225b733981b0a77e5720f4b101e70c95f1fddb53ece1375a3c43c515cb6e7e700b84d13f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tex-gyre-math"

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
texlive-scripts-bin \
texlive-tex-gyre-math-fonts"

inherit rpm
