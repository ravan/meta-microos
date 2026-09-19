SUMMARY = "Easily typesetting Chinese theses or books"
DESCRIPTION = "easybook is a pure academic template created based on the \
ctexbook book document class. It also has the functions of book \
and article document class. Combined with the general framework \
design of the dissertation of many universities in China, \
providing multiple commands and interfaces allows users to \
easily customize the thesis template. Its basic macro package \
easybase can also be used with CTeX and standard document \
classes."
LICENSE = "LPPL-1.0"

PV = "2026.226.2025aesvn76924"

RPM_NAME = "texlive-easybook-2026.226.2025aesvn76924-61.4.noarch.rpm"
RPM_HASH = "31771699580c88d0c2f511d6906157b63af42d7e0a23cef3e554a2c695d255268b34067d8e01b7dc2723d7acc44acae6998ea8586f87e675db93836227acfce4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-easybase.sty \
tex-easybook.cls \
tex-eb-tcolorbox.cfg \
texlive-easybook"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amsthm.sty \
tex-biblatex.sty \
tex-bm.sty \
tex-chemformula.sty \
tex-ctex.sty \
tex-ctexbook.cls \
tex-etoolbox.sty \
tex-hyperref.sty \
tex-keytheorems.sty \
tex-l3keys2e.sty \
tex-mhchem.sty \
tex-natbib.sty \
tex-newtxmath.sty \
tex-thmtools.sty \
tex-times.sty \
tex-xtemplate.sty \
tex-zref-perpage.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
