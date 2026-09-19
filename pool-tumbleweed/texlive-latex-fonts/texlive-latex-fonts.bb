SUMMARY = "A collection of fonts used in LaTeX distributions"
DESCRIPTION = "This is a collection of fonts for use with standard LaTeX \
packages and classes. It includes 'invisible' fonts (for use \
with the slides class), line and circle fonts (for use in the \
picture environment) and 'LaTeX symbol' fonts. For full support \
of a LaTeX installation, some Computer Modern font variants \
cmbsy(6-9), cmcsc(8,9), cmex(7-9) and cmmib(5-9) from the \
amsfonts distribution, are also necessary. The fonts are \
available as Metafont source, and metric (tfm) files are also \
provided. Most of the fonts are also available in Adobe Type 1 \
format, in the amsfonts distribution."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn28888"

RPM_NAME = "texlive-latex-fonts-2026.226.svn28888-63.2.noarch.rpm"
RPM_HASH = "467c2be801f9aa1e52dc66bfb8bdd7654527c5e2b339fe2979e5e2e78caaab828828995294ca9593b6ba06a6eca7f39dab3e4752ddcef00297b8bd1a2d53958c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-icmcsc10.tfm \
tex-icmex10.tfm \
tex-icmmi8.tfm \
tex-icmsy8.tfm \
tex-icmtt8.tfm \
tex-ilasy8.tfm \
tex-ilcmss8.tfm \
tex-ilcmssb8.tfm \
tex-ilcmssi8.tfm \
tex-lasy10.tfm \
tex-lasy5.tfm \
tex-lasy6.tfm \
tex-lasy7.tfm \
tex-lasy8.tfm \
tex-lasy9.tfm \
tex-lasyb10.tfm \
tex-lcircle10.tfm \
tex-lcirclew10.tfm \
tex-lcmss8.tfm \
tex-lcmssb8.tfm \
tex-lcmssi8.tfm \
tex-line10.tfm \
tex-linew10.tfm \
texlive-latex-fonts"

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
