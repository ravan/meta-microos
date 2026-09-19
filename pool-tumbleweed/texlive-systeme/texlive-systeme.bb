SUMMARY = "Format systems of equations"
DESCRIPTION = "The package allows you to enter systems of equations or \
inequalities in an intuitive way, and produces typeset output \
where the terms and signs are aligned vertically. The package \
works with plain TeX or LaTeX, but e-TeX is required. Cette \
petite extension permet de saisir des systemes d'equations ou \
inequations de facon intuitive, et produit un affichage ou les \
termes et les signes sont alignes verticalement."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.51svn77682"

RPM_NAME = "texlive-systeme-2026.226.0.0.51svn77682-64.2.noarch.rpm"
RPM_HASH = "ad5f4427d9566c2802a49fbe505a547b078f49862b15ad57712504488aad6ebc7bfb1100b78979eb52df3efdb5540159e47c331de488531cb04b308b4ba60713"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-systeme.sty \
tex-systeme.tex \
texlive-systeme"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-simplekv.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
