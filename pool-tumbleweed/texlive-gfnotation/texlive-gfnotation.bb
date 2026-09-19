SUMMARY = "Typeset Gottlob Frege's notation in plain TeX"
DESCRIPTION = "The package implements macros for plain TeX to typeset the \
notation invented by Gottlob Frege in 1879 for his books \
'Begriffsschrift' and 'Grundgesetze der Arithmetik' (two \
volumes). The output styles of both books are supported."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.9svn37156"

RPM_NAME = "texlive-gfnotation-2026.226.2.9svn37156-60.2.noarch.rpm"
RPM_HASH = "5bf2bba893f9a471b84696608f658029baf06dc2ff4d407f7c4623101acb7b8966a46e3f3cac4d8f8e9a05a0c7e79494f4586cea7e3d80cc55d2057cb31ce18c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-GFnotation.tex \
texlive-gfnotation"

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
